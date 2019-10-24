

package Islemler;
import java.sql.*;
import Tablolar.*;
import java.util.*;

    public class tblbiletler_crd
           {

                              public static String Kaydet(tblbiletler nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn =Saglayici.Baglanti();
                                        String sql="insert into tblbiletler(EtkinlikAdi,EtkinlikTarihi,EtkinlikLinki) values(?,?,?)";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getEtkinlikAdi());
                                        par.setString(2,nesne.getEtkinlikTarihi());
                                        par.setString(3,nesne.getEtkinlikLinki());
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

                              public static String Duzelt(tblbiletler nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn = Saglayici.Baglanti();
                                        String sql="update tblbiletler set EtkinlikAdi=?,EtkinlikTarihi=?,EtkinlikLinki=? where pkBiletID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getEtkinlikAdi());
                                        par.setString(2,nesne.getEtkinlikTarihi());
                                        par.setString(3,nesne.getEtkinlikLinki());
                                        par.setInt(4,nesne.getpkBiletID());
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

                              public static String Sil(int pkBiletID) {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblbiletler where pkBiletID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setInt(1,pkBiletID);
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
                                        String SQL="select * from tblbiletler order by pkBiletID DESC";
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
                                        String SQL="select pkBiletID from tblbiletler order by pkBiletID DESC limit 1";
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next())
                                             {
                                                id = kayitlar.getInt("pkBiletID");
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

                              public static ResultSet idyeGoreKayitRsGetir(int pkBiletID) {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblbiletler where  pkBiletID="+pkBiletID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         kayitlar =null;
                                         }
                                         return kayitlar;

                                     }

                              public static tblbiletler idyeGoreKayitObjeGetir(int pkBiletID) {

                                    tblbiletler kisi = new tblbiletler();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblbiletler where  pkBiletID="+pkBiletID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkBiletID(kayitlar.getInt("pkBiletID"));
                                        kisi.setEtkinlikAdi(kayitlar.getString("EtkinlikAdi"));
                                        kisi.setEtkinlikTarihi(kayitlar.getString("EtkinlikTarihi"));
                                        kisi.setEtkinlikLinki(kayitlar.getString("EtkinlikLinki"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static tblbiletler SorguObjeGetir(String SQL) {

                                    tblbiletler kisi = new tblbiletler();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkBiletID(kayitlar.getInt("pkBiletID"));
                                        kisi.setEtkinlikAdi(kayitlar.getString("EtkinlikAdi"));
                                        kisi.setEtkinlikTarihi(kayitlar.getString("EtkinlikTarihi"));
                                        kisi.setEtkinlikLinki(kayitlar.getString("EtkinlikLinki"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static List<tblbiletler> ListTumKayitlar() {

                                    List<tblbiletler> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblbiletler order by pkBiletID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblbiletler kisi = new tblbiletler();
                                       kisi.setpkBiletID(kayitlar.getInt("pkBiletID"));
                                       kisi.setEtkinlikAdi(kayitlar.getString("EtkinlikAdi"));
                                       kisi.setEtkinlikTarihi(kayitlar.getString("EtkinlikTarihi"));
                                       kisi.setEtkinlikLinki(kayitlar.getString("EtkinlikLinki"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblbiletler> ListSorguKayitlar(String SQL) {

                                    List<tblbiletler> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblbiletler kisi = new tblbiletler();
                                       kisi.setpkBiletID(kayitlar.getInt("pkBiletID"));
                                       kisi.setEtkinlikAdi(kayitlar.getString("EtkinlikAdi"));
                                       kisi.setEtkinlikTarihi(kayitlar.getString("EtkinlikTarihi"));
                                       kisi.setEtkinlikLinki(kayitlar.getString("EtkinlikLinki"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblbiletler> RsToList(ResultSet kayitlar) {

                                    List<tblbiletler> liste = new ArrayList<>();
                                    try {
                                        while (kayitlar.next()) {
                                         tblbiletler kisi = new tblbiletler();
                                       kisi.setpkBiletID(kayitlar.getInt("pkBiletID"));
                                       kisi.setEtkinlikAdi(kayitlar.getString("EtkinlikAdi"));
                                       kisi.setEtkinlikTarihi(kayitlar.getString("EtkinlikTarihi"));
                                       kisi.setEtkinlikLinki(kayitlar.getString("EtkinlikLinki"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }



            }
