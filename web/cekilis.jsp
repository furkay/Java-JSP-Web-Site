
<%@page import="Tablolar.tblkazananlar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Codes.Cekilis"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //index.jsp ye uğramadan doğrudan bu sayfa açılırsa...tekrar index.jsp
    //geri gönderir.... illa oturum açılacak.....
    if (session.getAttribute("Oturum") == null) {

        response.sendRedirect("index.jsp");

    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="shortcut icon" href="Images/gdg.png" />
    <title>GDG BOLU</title>
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />



    <link rel="stylesheet" type="text/css" href="cekilis/bootstrap.min.css">
        <script type="text/javascript" src="cekilis/bootstrap.min.js"></script>
        <script type="text/javascript" src="cekilis/jquery.js"></script>
        <script type="text/javascript" src="cekilis/popper.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,500" rel="stylesheet">
            <link rel="stylesheet" type="text/css" href="cekilis/main.css">
                </head>
                <body>
                    <% ArrayList<String> arrayList = new ArrayList<String>();
                    String metin="";
                    
                    %>

                <div class="container-fluid">
                    <div class="row ana-kisim">
                        <div class="container-fluid">
                           
                            <div class="orta-resim">
                                <img src="cekilis/siteresim.png">
                            </div>
                            
                        </div>
                        <div class="col-md-3">

                        </div>
                        <div class="col-md-6">
                            <%request.setCharacterEncoding("utf-8");
                                if (request.getParameter("btnCek") != null) {
                                    String i = request.getParameter("txtCekilis");
                                    int sayi = Integer.parseInt(i);

                                    Cekilis cekilis = new Cekilis(sayi, arrayList);
                                      metin="Kazananlar";
                                }
                            %>
                            <form>
                                <h1 class="title">Hediye Çekilişi</h1>
                                <input class="sayi" type="text" name="txtCekilisAdi" required placeholder="Hediye Adı giriniz..."><br>
                                <input class="sayi" type="number" name="txtCekilis" required placeholder="Sayı giriniz..."><br>
                                    <button type="submit" class="btn btn-primary btn-Cekilis" onclick="" name="btnCek">Çekiliş Yap</button><br>

                                    <p class="winners-title"><%=metin%></p>
                                    <label class="winners" style="margin-top: 0px;" ><% for (String s : arrayList) {
                                        
                                            String cekilisAdi= request.getParameter("txtCekilisAdi");
                                            Tablolar.tblkazananlar nesne=new tblkazananlar();
                                            nesne.setHediyeAdi(cekilisAdi);
                                            nesne.setKazananAdi(s);
                                             Islemler.tblkazananlar_crd.Kaydet(nesne);
                                            
                                        
                                        
                                            out.println(s.toUpperCase()+"<br>") ;
                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                        }%></label><br>
                                    </form>
                                    </div>
                                    <div class="col-md-3">

                                    </div>
                                    </div>
                                    </div>




                                    </body>
                                    </html>
