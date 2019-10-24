

package Islemler;
import java.sql.*;
import Tablolar.*;
import java.util.*;

    public class tblicerik_crd
           {

                              public static String Kaydet(tblicerik nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn =Saglayici.Baglanti();
                                        String sql="insert into tblicerik(IcerikIsim,IcerikAciklama,Resim,Konu) values(?,?,?,?)";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getIcerikIsim());
                                        par.setString(2,nesne.getIcerikAciklama());
                                        par.setString(3,nesne.getResim());
                                        par.setString(4,nesne.getKonu());
                                        par.execute();
                                        conn.close();

                                        Mesaj="1";

                                         }

                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         Mesaj ="0";
                                     }

                                    return Mesaj;

                                     }

                              public static String Duzelt(tblicerik nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn = Saglayici.Baglanti();
                                        String sql="update tblicerik set IcerikIsim=?,IcerikAciklama=?,Resim=?,Konu=? where pkIcerikID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getIcerikIsim());
                                        par.setString(2,nesne.getIcerikAciklama());
                                        par.setString(3,nesne.getResim());
                                        par.setString(4,nesne.getKonu());
                                        par.setInt(5,nesne.getpkIcerikID());
                                        par.execute();
                                        conn.close();

                                        Mesaj="1";

                                         }

                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         Mesaj ="0";
                                     }

                                    return Mesaj;

                                     }

                              public static String Sil(int pkIcerikID) {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblicerik where pkIcerikID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setInt(1,pkIcerikID);
                                        par.execute();
                                        Mesaj="1";

                                        conn.close();

                                        Mesaj="1";

                                         }

                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         Mesaj ="0";
                                     }

                                    return Mesaj;

                                     }

                              public static ResultSet TumKayitlar() {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn =Saglayici.Baglanti();
                                        String SQL="select * from tblicerik order by pkIcerikID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                     }

                                    return kayitlar;

                                     }

                              public static int SorguKayitSayi(String SQL) {

                                    int KayitSayi =0;
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn =Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                         while(kayitlar.next()){KayitSayi++;}
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                     }

                                    return KayitSayi;

                                     }

                              public static int ToplamKayitSayisi() throws SQLException {

                                        int KayitSayi =0;
                                        ResultSet gelen=TumKayitlar();
                                         while(gelen.next()){KayitSayi++;}
                                        return KayitSayi;

                                     }

                              public static int RsKayitSayisi(ResultSet rs) throws SQLException {

                                        int KayitSayi =0;
                                         while(rs.next()){KayitSayi++;}
                                          rs.beforeFirst();
                                        return KayitSayi;

                                     }

                              public static int SonKayitID() {

                                    int id = -1;
                                    ResultSet kayitlar = null;
                                    try {
                                        String SQL="select pkIcerikID from tblicerik order by pkIcerikID DESC limit 1";
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next())
                                             {
                                                id = kayitlar.getInt("pkIcerikID");
                                             }
                                        conn.close();

                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                     }

                                    return id;

                                     }

                              public static ResultSet VeriKumesi(String SQL) {


                                    String Mesaj = null;
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn =Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                         }
                                    catch (SQLException e) {kayitlar =null;}return kayitlar;

                                     }

                              public static String KomutIslet(String SQL) {

                                    String Mesaj = null;
                                    try {
                                        Connection conn =Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        int s=komut.executeUpdate(SQL);
                                        Mesaj = String.valueOf(s);
                                        conn.close();
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         Mesaj="0";                                     }

                                    return Mesaj;

                                     }

                              public static ResultSet idyeGoreKayitRsGetir(int pkIcerikID) {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblicerik where  pkIcerikID="+pkIcerikID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         kayitlar =null;
                                         }
                                         return kayitlar;

                                     }

                              public static tblicerik idyeGoreKayitObjeGetir(int pkIcerikID) {

                                    tblicerik kisi = new tblicerik();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblicerik where  pkIcerikID="+pkIcerikID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkIcerikID(kayitlar.getInt("pkIcerikID"));
                                        kisi.setIcerikIsim(kayitlar.getString("IcerikIsim"));
                                        kisi.setIcerikAciklama(kayitlar.getString("IcerikAciklama"));
                                        kisi.setResim(kayitlar.getString("Resim"));
                                        kisi.setKonu(kayitlar.getString("Konu"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static tblicerik SorguObjeGetir(String SQL) {

                                    tblicerik kisi = new tblicerik();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkIcerikID(kayitlar.getInt("pkIcerikID"));
                                        kisi.setIcerikIsim(kayitlar.getString("IcerikIsim"));
                                        kisi.setIcerikAciklama(kayitlar.getString("IcerikAciklama"));
                                        kisi.setResim(kayitlar.getString("Resim"));
                                        kisi.setKonu(kayitlar.getString("Konu"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static List<tblicerik> ListTumKayitlar() {

                                    List<tblicerik> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblicerik order by pkIcerikID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblicerik kisi = new tblicerik();
                                       kisi.setpkIcerikID(kayitlar.getInt("pkIcerikID"));
                                       kisi.setIcerikIsim(kayitlar.getString("IcerikIsim"));
                                       kisi.setIcerikAciklama(kayitlar.getString("IcerikAciklama"));
                                       kisi.setResim(kayitlar.getString("Resim"));
                                       kisi.setKonu(kayitlar.getString("Konu"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblicerik> ListSorguKayitlar(String SQL) {

                                    List<tblicerik> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblicerik kisi = new tblicerik();
                                       kisi.setpkIcerikID(kayitlar.getInt("pkIcerikID"));
                                       kisi.setIcerikIsim(kayitlar.getString("IcerikIsim"));
                                       kisi.setIcerikAciklama(kayitlar.getString("IcerikAciklama"));
                                       kisi.setResim(kayitlar.getString("Resim"));
                                       kisi.setKonu(kayitlar.getString("Konu"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblicerik> RsToList(ResultSet kayitlar) {

                                    List<tblicerik> liste = new ArrayList<>();
                                    try {
                                        while (kayitlar.next()) {
                                         tblicerik kisi = new tblicerik();
                                       kisi.setpkIcerikID(kayitlar.getInt("pkIcerikID"));
                                       kisi.setIcerikIsim(kayitlar.getString("IcerikIsim"));
                                       kisi.setIcerikAciklama(kayitlar.getString("IcerikAciklama"));
                                       kisi.setResim(kayitlar.getString("Resim"));
                                       kisi.setKonu(kayitlar.getString("Konu"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }



            }
