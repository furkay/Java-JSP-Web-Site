
<%@page import="Tablolar.tblkatilimcilar"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 


Islemler.tblkatilimcilar_crd.TumunuSil();
  response.sendRedirect("KatilimciListele.jsp");
 

%>