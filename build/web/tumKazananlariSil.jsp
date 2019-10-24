
<%@page import="Tablolar.tblkatilimcilar"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 


Islemler.tblkazananlar_crd.TumunuSil();
  response.sendRedirect("kazananlariSil.jsp");
 

%>