
package Codes;

import java.io.IOException;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.server.UID;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.filechooser.FileNameExtensionFilter;


@WebServlet("/UploadImage")
@MultipartConfig(maxFileSize=16177216)
public class UploadImage extends HttpServlet {
    PrintWriter out;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       out=response.getWriter(); 
       int result=0;
     
       Connection con=null;
       Part part=request.getPart("ResimYukle");
       String Baslik=request.getParameter("txtBaslik");
       String Aciklama=request.getParameter("txtAciklama");
       String Konu=request.getParameter("txtKonu");
       String FileName=part.getSubmittedFileName();
       String uniqueID = UUID.randomUUID().toString();

       new File("C:\\Users\\furka\\Documents\\NetBeansProjects\\WebSitesiOrnek\\web\\backend-images\\uid\\"+uniqueID).mkdir();
   
      // Path file = Paths.get("C:\\Users\\furka\\Documents\\NetBeansProjects\\WebSitesiOrnek\\web\\backend-images\\"+uid);
       
       
       
       
       if(part !=null){
           try{
               Connection conn=Islemler.Saglayici.Baglanti();
               PreparedStatement ps=conn.prepareStatement("insert into tblIcerik(IcerikIsim,IcerikAciklama,Resim,Konu) values(?,?,?,?)");
               InputStream is=part.getInputStream();
               
               String savePath="C:\\Users\\furka\\Documents\\NetBeansProjects\\WebSitesiOrnek\\web\\backend-images\\"+"uid\\"+uniqueID+File.separator+FileName;
               File fileSaveDir=new File(savePath);
               part.write(savePath+File.separator);
               String savedPath="backend-images\\uid\\"+uniqueID+"\\"+File.separator+FileName;
               
               ps.setString(4,Konu);
               ps.setString(3,savedPath);
              // ps.setBlob(3, is);
               ps.setString(1, Baslik);
               ps.setString(2, Aciklama);
               result=ps.executeUpdate();
               if(result>0){
                   
                   response.sendRedirect("Yonetim.jsp");
                   
               }
           }catch(Exception e){
               
               out.print(e);
           }
           
           
       }
       



    }

    private String encodeFileToBase64Binary(InputStream is) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
