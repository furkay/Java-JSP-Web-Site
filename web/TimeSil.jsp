
<%@page import="org.apache.tomcat.util.http.fileupload.FileUtils"%>
<%@page import="java.io.File"%>
<%@page import="Tablolar.tblicerik"%>
<%@page import="Tablolar.tblkatilimcilar"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

int id=Integer.parseInt(request.getParameter("id"));
tblicerik nesne=Islemler.tblicerik_crd.idyeGoreKayitObjeGetir(id);
String yol=nesne.getResim();

	String directoryPath = "C:/Users/furka/Documents/NetBeansProjects/WebSitesiOrnek/web/"+yol.substring(0,56);
       
	File file = new File(directoryPath);
    
		try {
			//Deleting the directory recursively using FileUtils.
			FileUtils.deleteDirectory(file);
			System.out.println("Directory has been deleted recursively !");
		} catch (Exception e) {
			System.out.println("Problem occurs when deleting the directory : " + directoryPath);
			e.printStackTrace();
		}



Islemler.tblicerik_crd.Sil(id);




  
  response.sendRedirect("TimeLineSil.jsp");
 

%>
