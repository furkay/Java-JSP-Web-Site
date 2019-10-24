
<%@page import="Tablolar.tblkatilimcilar"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

int id=Integer.parseInt(request.getParameter("id"));
Islemler.tblkatilimcilar_crd.Sil(id);
  response.sendRedirect("KatilimciListele.jsp");
 

%>
