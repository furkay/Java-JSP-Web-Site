<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="nav">
    <li class="nav-header">Menü</li>
    <li><a href="Yonetim.jsp"><i class="fa fa-home"></i> <span>Ana Sayfa</span></a></li>
    <li><a href="KatilimciEkle.jsp"><i class="fa fa-plus-square" ></i> <span>Katılımcı Ekle</span></a></li>
    <li><a href="KatilimciListele.jsp"><i class="fa fa-users"></i> <span>Katılımcı Listele</span></a></li>
    <li class="has-sub">
        <a href="javascript:;">
            <b class="caret pull-right" ></b>
            <i class="fa fa-laptop"></i>
            <span>TimeLine İşlemleri</span>
        </a>
        <ul class="sub-menu">
            <li><a href="TimeLine.jsp">TimeLine Ekle</a></li>
            <li><a href="TimeLineSil.jsp">TimeLine Sil</a></li>
         </ul>
    </li>
    <li class="has-sub">
        <a href="javascript:;">
            <b class="caret pull-right"></b>
            <i class="fa fa-laptop"></i>
            <span>Sözleşme İşlemleri</span>
        </a>
        <ul class="sub-menu">
            <li><a href="YeniSozlesme.jsp">Yeni Sözleşme</a></li>
            <li><a href="SozlesmeListe.jsp">Sözleşmeleri Listele</a></li>
           
        </ul>
    </li>
     <li class="has-sub">
        <a href="javascript:;">
            <b class="caret pull-right"></b>
            <i class="fa fa-laptop"></i>
            <span>Etkinlik Ayarı</span>
        </a>
        <ul class="sub-menu">
            <li><a href="BiletEkle.jsp">Bilet Oluştur</a></li>
            <li><a href="kazananlariSil.jsp">Kazananları Sil</a></li>
           
        </ul>
    </li>
 
   <li><a href="index.jsp?q=1"><i class="fa fa-times-circle"></i> <span>Güvenli Çıkış</span></a></li>

    <!-- begin sidebar minify button -->
    <li><a href="javascript:;" class="sidebar-minify-btn" data-click="sidebar-minify"><i class="fa fa-angle-double-left"></i></a></li>
    <!-- end sidebar minify button -->
</ul>

