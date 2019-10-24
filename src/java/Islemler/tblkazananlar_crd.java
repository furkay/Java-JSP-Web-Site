

package Islemler;
import java.sql.*;
import Tablolar.*;
import java.util.*;

    public class tblkazananlar_crd
           {

                              public static String Kaydet(tblkazananlar nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn =Saglayici.Baglanti();
                                        String sql="insert into tblkazananlar(KazananAdi,HediyeAdi) values(?,?)";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getKazananAdi());
                                        par.setString(2,nesne.getHediyeAdi());
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

                              public static String Duzelt(tblkazananlar nesne) {

                                    String Mesaj = null;
                                    try {

                                        Connection conn = Saglayici.Baglanti();
                                        String sql="update tblkazananlar set KazananAdi=?,HediyeAdi=? where pkKazananID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setString(1,nesne.getKazananAdi());
                                        par.setString(2,nesne.getHediyeAdi());
                                        par.setInt(3,nesne.getpkKazananID());
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

                                 public static String TumunuSil() {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblkazananlar";
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
                              
                              public static String Sil(int pkKazananID) {

                                    String Mesaj = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String sql="delete from tblkazananlar where pkKazananID=?";
                                        PreparedStatement par;
                                        par = conn.prepareStatement(sql);
                                        par.setInt(1,pkKazananID);
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
                                        String SQL="select * from tblkazananlar order by pkKazananID DESC";
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
                                        String SQL="select pkKazananID from tblkazananlar order by pkKazananID DESC limit 1";
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next())
                                             {
                                                id = kayitlar.getInt("pkKazananID");
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

                              public static ResultSet idyeGoreKayitRsGetir(int pkKazananID) {

                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkazananlar where  pkKazananID="+pkKazananID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         kayitlar =null;
                                         }
                                         return kayitlar;

                                     }

                              public static tblkazananlar idyeGoreKayitObjeGetir(int pkKazananID) {

                                    tblkazananlar kisi = new tblkazananlar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkazananlar where  pkKazananID="+pkKazananID;
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKazananID(kayitlar.getInt("pkKazananID"));
                                        kisi.setKazananAdi(kayitlar.getString("KazananAdi"));
                                        kisi.setHediyeAdi(kayitlar.getString("HediyeAdi"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static tblkazananlar SorguObjeGetir(String SQL) {

                                    tblkazananlar kisi = new tblkazananlar();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                        kisi.setpkKazananID(kayitlar.getInt("pkKazananID"));
                                        kisi.setKazananAdi(kayitlar.getString("KazananAdi"));
                                        kisi.setHediyeAdi(kayitlar.getString("HediyeAdi"));
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return kisi;

                                     }

                              public static List<tblkazananlar> ListTumKayitlar() {

                                    List<tblkazananlar> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        String SQL="select * from tblkazananlar order by pkKazananID DESC";
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblkazananlar kisi = new tblkazananlar();
                                       kisi.setpkKazananID(kayitlar.getInt("pkKazananID"));
                                       kisi.setKazananAdi(kayitlar.getString("KazananAdi"));
                                       kisi.setHediyeAdi(kayitlar.getString("HediyeAdi"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblkazananlar> ListSorguKayitlar(String SQL) {

                                    List<tblkazananlar> liste = new ArrayList<>();
                                    ResultSet kayitlar = null;
                                    try {
                                        Connection conn = Saglayici.Baglanti();
                                        Statement komut = conn.createStatement();
                                        kayitlar = komut.executeQuery(SQL);
                                        while (kayitlar.next()) {
                                         tblkazananlar kisi = new tblkazananlar();
                                       kisi.setpkKazananID(kayitlar.getInt("pkKazananID"));
                                       kisi.setKazananAdi(kayitlar.getString("KazananAdi"));
                                       kisi.setHediyeAdi(kayitlar.getString("HediyeAdi"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }

                              public static List<tblkazananlar> RsToList(ResultSet kayitlar) {

                                    List<tblkazananlar> liste = new ArrayList<>();
                                    try {
                                        while (kayitlar.next()) {
                                         tblkazananlar kisi = new tblkazananlar();
                                       kisi.setpkKazananID(kayitlar.getInt("pkKazananID"));
                                       kisi.setKazananAdi(kayitlar.getString("KazananAdi"));
                                       kisi.setHediyeAdi(kayitlar.getString("HediyeAdi"));
                                        liste.add(kisi);
                                                      }
                                              
                                         }
                                    catch (SQLException hata) {
                                         System.out.println(hata.getMessage());
                                         }
                                         return liste;

                                     }



            }
