package Codes;

import Islemler.Saglayici;
import Islemler.tblkatilimcilar_crd;
import Tablolar.tblkatilimcilar;
import com.mysql.jdbc.ResultSetRow;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class Cekilis {
      
 public Cekilis(int sayi,ArrayList arrayList) throws Exception {
    
   String SQL="SELECT * FROM tblkatilimcilar ORDER BY RAND() LIMIT "+sayi;
   ResultSet rs=Islemler.tblkatilimcilar_crd.Cekilis(SQL);
   while(rs.next()){
        arrayList.add(rs.getString("KatilimciAdi"));
   }
 }
    
    
    
    
    
    
    
    
    
    
    
    
//    ArrayList<Integer> sayiTut = new ArrayList<Integer>();
//    ArrayList<String> sonucListesi = new ArrayList<String>();
//
//    public Cekilis(ArrayList array, int CekilmeSayisi) {
//        int ArraySize = array.size();
//        for (int i = 0; i < CekilmeSayisi; i++) {
//            Random rnd = new Random();
//            int random = rnd.nextInt(ArraySize);
//
//           if (!sayiTut.isEmpty()) {
//
//                for (int j = 0; j < sayiTut.size(); j++) {
//
//                    if (sayiTut.get(j) == random) {
//                        return;
//                    } else {
//
//                        sayiTut.add(random);
//                    }
//                }
//
//            } else {
//                sayiTut.add(random);
//            }
//
//        }
//
//        for (int k = 0; k < sayiTut.size(); k++) {
//            String ad = array.get(k).toString();
//            sonucListesi.add(ad);
//
//        }
//
//        for (String s : sonucListesi) {
//            System.out.println(s);
//        }
//
//    }

}
