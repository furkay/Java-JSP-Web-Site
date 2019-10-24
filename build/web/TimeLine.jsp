



<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Tablolar.tblicerik"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //index.jsp ye uğramadan doğrudan bu sayfa açılırsa...tekrar index.jsp
    //geri gönderir.... illa oturum açılacak.....
    if (session.getAttribute("Oturum") == null) {

        response.sendRedirect("index.jsp");

    }

%>
<!DOCTYPE html>
<html lang="tr">
    <head>
    <link rel="shortcut icon" href="Images/gdg.png" />
    <meta charset="utf-8" />
    <title>GDG Bolu Yönetim</title>
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />

    <!-- ================== BEGIN BASE CSS STYLE ================== -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&subset=latin,latin-ext" rel="stylesheet">
        <link href="assets/plugins/jquery-ui-1.10.4/themes/base/minified/jquery-ui.min.css" rel="stylesheet" />
        <link href="assets/plugins/bootstrap-3.2.0/css/bootstrap.min.css" rel="stylesheet" />
        <link href="assets/plugins/font-awesome-4.2.0/css/font-awesome.min.css" rel="stylesheet" />
        <link href="assets/css/animate.min.css" rel="stylesheet" />
        <link href="assets/css/style.min.css" rel="stylesheet" />
        <link href="assets/css/style-responsive.min.css" rel="stylesheet" />
        <link href="assets/css/theme/default.css" rel="stylesheet" id="theme" />
        <!-- ================== END BASE CSS STYLE ================== -->
    </head>
    <body>

    <div id="page-container" class="fade page-sidebar-fixed page-header-fixed">
        <div id="page-loader" class="fade in"><span class="spinner"></span></div>
            <%@include file="header.jsp"%>
        <div id="sidebar" class="sidebar">

            <div data-scrollbar="true" data-height="100%">
                
                <ul class="nav">
                    <li class="nav-profile">

                        <div class="info">
                            <%= session.getAttribute("kullaniciadi")%>

                        </div>
                    </li>
                </ul>

                <!--MENÜ BURADA OLACAK....-->

                <%@include file="menu.jsp"%>

            </div>

        </div>
        <div class="sidebar-bg"></div>



        <div class="content" id="content">


            <form   action="UploadImage" method="post" enctype="multipart/form-data" >

                <input type="file" accept="image/*" name="ResimYukle"  />
                <br/>
                <input type="text" name="txtBaslik" placeholder="Başlık Giriniz"  maxlength="255"/>
                <br/>
                <textarea  name="txtAciklama" rows="4" cols="50" placeholder="Açıklama Giriniz" maxlength="2500"></textarea>  
                <br/>
                  <br/>
              <select name="txtKonu">
                            <option value="gdg">GDG</option>
                            <option value="wtm">WTM</option>
                            <option value="workshop">WorkShop</option>
                            <option value="other">Diğer</option>
              </select>
                <br/>
                <input type="submit" value="Kaydet" name="btnUpload"/>

            </form>

        </div>
        <a href="javascript:;" class="btn btn-icon btn-circle btn-success btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
    </div>

    <!-- ================== BEGIN BASE JS ================== -->
    <script src="assets/plugins/jquery-1.8.2/jquery-1.8.2.min.js"></script>
    <script src="assets/plugins/jquery-ui-1.10.4/ui/minified/jquery-ui.min.js"></script>
    <script src="assets/plugins/bootstrap-3.2.0/js/bootstrap.min.js"></script>
    <!--[if lt IE 9]>
            <script src="assets/crossbrowserjs/html5shiv.js"></script>
            <script src="assets/crossbrowserjs/respond.min.js"></script>
            <script src="assets/crossbrowserjs/excanvas.min.js"></script>
    <![endif]-->
    <script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="assets/plugins/jquery-cookie/jquery.cookie.js"></script>
    <!-- ================== END BASE JS ================== -->

    <!-- ================== BEGIN PAGE LEVEL JS ================== -->
    <script src="assets/js/apps.min.js"></script>
    <!-- ================== END PAGE LEVEL JS ================== -->
    <script>
        $(document).ready(function () {
            App.init();
        });
    </script>
</body>
</html>
