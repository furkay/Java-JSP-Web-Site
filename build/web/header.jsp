

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="header" class="header navbar navbar-default navbar-fixed-top">
    <!-- begin container-fluid -->
    <div class="container-fluid">
        <!-- begin mobile sidebar expand / collapse button -->
        <div class="navbar-header">
            <a href="Yonetim.jsp" class="navbar-brand"><span class=""><img src="Images/logov1.png"/></span> </a>
            <button type="button" class="navbar-toggle" data-click="sidebar-toggled">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <!-- end mobile sidebar expand / collapse button -->

        <!-- begin header navigation right -->
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown navbar-user">
                <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">

                    <span class="hidden-xs"> <%= session.getAttribute("kullaniciadi")%></span> <b class="caret"></b>
                </a>
                <ul class="dropdown-menu animated fadeInLeft">
                    <li class="arrow"></li>
                    <li><a href="sifreyenile.jsp">Şifre Değiştir</a></li>

                    <li><a href="adminekle.jsp">Admin Ekle</a></li>
                    <li class="divider"></li>
                    <li><a href="index.jsp?q=1">Güvenli Çıkış</a></li>
                </ul>
            </li>
        </ul>
        <!-- end header navigation right -->
    </div>
    <!-- end container-fluid -->
</div>