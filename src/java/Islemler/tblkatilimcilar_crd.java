
package Islemler;
import java.sql.*;
import Tablolar.*;
import java.util.*;

    public class tblkatilimcilar_crd
           {

                            
        
        
        
        
                              public static String Kaydet(tblkatilimcilar nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn =Saglayici.Baglanti();
                                        String sql="insert into tblkatilimcilar(KatilimciAdi) values(?)";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getKatilimciAdi());
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

                              public static String Duzelt(tblkatilimcilar nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn = Saglayici.Baglanti();
                                        String sql="update tblkatilimcilar set KatilimciAdi=? where pkKatilimciID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getKatilimciAdi());
                                        par.setInt(2,nesne.getpkKatilimciID());
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

                              public static String Sil(int pkKatilimciID) {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblkatilimcilar where pkKatilimciID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setInt(1,pkKatilimciID);
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
                                 public static String TumunuSil() {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblkatilimcilar";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        
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
                                        String SQL="select * from tblkatilimcilar order by pkKatilimciID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                     }

                                    return kayitlar;

                                     }
                                 public static ResultSet Cekilis(String SQL) {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn =Saglayici.Baglanti();
                                        
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
                                        return KayitSayi;

                                     }

                              public static int SonKayitID() {

                                    int id = -1;
                                    ResultSet kayitlar = null;
                                    try {
                                        String SQL="select pkKatilimciID from tblkatilimcilar order by pkKatilimciID DESC limit 1";
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next())
                                             {
                                                id = kayitlar.getInt("pkKatilimciID");
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

                              public static ResultSet idyeGoreKayitRsGetir(int pkKatilimciID) {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkatilimcilar where  pkKatilimciID="+pkKatilimciID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         kayitlar =null;
                                         }
                                         return kayitlar;

                                     }

                              public static tblkatilimcilar idyeGoreKayitObjeGetir(int pkKatilimciID) {

                                    tblkatilimcilar kisi = new tblkatilimcilar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkatilimcilar where  pkKatilimciID="+pkKatilimciID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKatilimciID(kayitlar.getInt("pkKatilimciID"));
                                        kisi.setKatilimciAdi(kayitlar.getString("KatilimciAdi"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static tblkatilimcilar SorguObjeGetir(String SQL) {

                                    tblkatilimcilar kisi = new tblkatilimcilar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKatilimciID(kayitlar.getInt("pkKatilimciID"));
                                        kisi.setKatilimciAdi(kayitlar.getString("KatilimciAdi"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static List<tblkatilimcilar> ListTumKayitlar() {

                                    List<tblkatilimcilar> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkatilimcilar order by pkKatilimciID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblkatilimcilar kisi = new tblkatilimcilar();
                                       kisi.setpkKatilimciID(kayitlar.getInt("pkKatilimciID"));
                                       kisi.setKatilimciAdi(kayitlar.getString("KatilimciAdi"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblkatilimcilar> ListSorguKayitlar(String SQL) {

                                    List<tblkatilimcilar> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblkatilimcilar kisi = new tblkatilimcilar();
                                       kisi.setpkKatilimciID(kayitlar.getInt("pkKatilimciID"));
                                       kisi.setKatilimciAdi(kayitlar.getString("KatilimciAdi"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblkatilimcilar> RsToList(ResultSet kayitlar) {

                                    List<tblkatilimcilar> liste = new ArrayList<>();
                                    try {
                                        while (kayitlar.next()) {
                                         tblkatilimcilar kisi = new tblkatilimcilar();
                                       kisi.setpkKatilimciID(kayitlar.getInt("pkKatilimciID"));
                                       kisi.setKatilimciAdi(kayitlar.getString("KatilimciAdi"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }



            }
