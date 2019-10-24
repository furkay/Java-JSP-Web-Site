
package Islemler;
import java.sql.*;
import Tablolar.*;
import java.util.*;

    public class tblkullanicilar_crd
           {

                              public static String Kaydet(tblkullanicilar nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn =Saglayici.Baglanti();
                                        String sql="insert into tblkullanicilar(KullaniciAdi,Sifre) values(?,?)";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getKullaniciAdi());
                                        par.setString(2,nesne.getSifre());
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

                              public static String Duzelt(tblkullanicilar nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn = Saglayici.Baglanti();
                                        String sql="update tblkullanicilar set KullaniciAdi=?,Sifre=? where pkKulllaniciID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getKullaniciAdi());
                                        par.setString(2,nesne.getSifre());
                                        par.setInt(3,nesne.getpkKulllaniciID());
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

                              public static String Sil(int pkKulllaniciID) {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblkullanicilar where pkKulllaniciID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setInt(1,pkKulllaniciID);
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
                                        String SQL="select * from tblkullanicilar order by pkKulllaniciID DESC";
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
                                        String SQL="select pkKulllaniciID from tblkullanicilar order by pkKulllaniciID DESC limit 1";
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next())
                                             {
                                                id = kayitlar.getInt("pkKulllaniciID");
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

                              public static ResultSet idyeGoreKayitRsGetir(int pkKulllaniciID) {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkullanicilar where  pkKulllaniciID="+pkKulllaniciID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         kayitlar =null;
                                         }
                                         return kayitlar;

                                     }

                              public static tblkullanicilar idyeGoreKayitObjeGetir(int pkKulllaniciID) {

                                    tblkullanicilar kisi = new tblkullanicilar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkullanicilar where  pkKulllaniciID="+pkKulllaniciID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKulllaniciID(kayitlar.getInt("pkKulllaniciID"));
                                        kisi.setKullaniciAdi(kayitlar.getString("KullaniciAdi"));
                                        kisi.setSifre(kayitlar.getString("Sifre"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }
                                public static tblkullanicilar adaGoreGetir(String SQL) {

                                    tblkullanicilar kisi = new tblkullanicilar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKulllaniciID(kayitlar.getInt("pkKulllaniciID"));
                                        kisi.setKullaniciAdi(kayitlar.getString("KullaniciAdi"));
                                        kisi.setSifre(kayitlar.getString("Sifre"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static tblkullanicilar SorguObjeGetir(String SQL) {

                                    tblkullanicilar kisi = new tblkullanicilar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKulllaniciID(kayitlar.getInt("pkKulllaniciID"));
                                        kisi.setKullaniciAdi(kayitlar.getString("KullaniciAdi"));
                                        kisi.setSifre(kayitlar.getString("Sifre"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static List<tblkullanicilar> ListTumKayitlar() {

                                    List<tblkullanicilar> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkullanicilar order by pkKulllaniciID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblkullanicilar kisi = new tblkullanicilar();
                                       kisi.setpkKulllaniciID(kayitlar.getInt("pkKulllaniciID"));
                                       kisi.setKullaniciAdi(kayitlar.getString("KullaniciAdi"));
                                       kisi.setSifre(kayitlar.getString("Sifre"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblkullanicilar> ListSorguKayitlar(String SQL) {

                                    List<tblkullanicilar> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblkullanicilar kisi = new tblkullanicilar();
                                       kisi.setpkKulllaniciID(kayitlar.getInt("pkKulllaniciID"));
                                       kisi.setKullaniciAdi(kayitlar.getString("KullaniciAdi"));
                                       kisi.setSifre(kayitlar.getString("Sifre"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblkullanicilar> RsToList(ResultSet kayitlar) {

                                    List<tblkullanicilar> liste = new ArrayList<>();
                                    try {
                                        while (kayitlar.next()) {
                                         tblkullanicilar kisi = new tblkullanicilar();
                                       kisi.setpkKulllaniciID(kayitlar.getInt("pkKulllaniciID"));
                                       kisi.setKullaniciAdi(kayitlar.getString("KullaniciAdi"));
                                       kisi.setSifre(kayitlar.getString("Sifre"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }



            }
