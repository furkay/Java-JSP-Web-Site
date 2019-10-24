<%-- 
    Document   : uploadFile
    Created on : 25.Ara.2018, 17:55:43
    Author     : furka
--%>


<%@page import="javafx.scene.transform.Scale"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.awt.Image"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.util.Base64"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Tablolar.tblicerik"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.DataInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
  
    
    <% 
        
        
       Connection conn=Islemler.Saglayici.Baglanti();
       String SQL="select * from tblicerik order by pkIcerikID DESC";
       //PreparedStatement ps=conn.prepareStatement(SQL);
       Statement komut = conn.createStatement();
        ResultSet kayitlar=komut.executeQuery(SQL);
      OutputStream img;
        while(kayitlar.next()){ %>

    <%=kayitlar.getString("IcerikIsim")%>
    <%=kayitlar.getString("IcerikAciklama")%>
   
     <img src="<%=kayitlar.getString("Resim")%>"/>
    
    <% }%>
       


 
</body>
</html>
