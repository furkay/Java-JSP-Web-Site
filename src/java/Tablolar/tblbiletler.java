package Tablolar;

    public class tblbiletler
         {

                 private int pkBiletID; 
                 private String EtkinlikAdi; 
                 private String EtkinlikTarihi; 
                 private String EtkinlikLinki; 

                 public int getpkBiletID()
                  {
                       return pkBiletID;
                  }


                 public void setpkBiletID(int pkBiletID)
                 {
                       this.pkBiletID=pkBiletID;
                 }

                 public String getEtkinlikAdi()
                  {
                       return EtkinlikAdi;
                  }


                 public void setEtkinlikAdi(String EtkinlikAdi)
                 {
                       this.EtkinlikAdi=EtkinlikAdi;
                 }

                 public String getEtkinlikTarihi()
                  {
                       return EtkinlikTarihi;
                  }


                 public void setEtkinlikTarihi(String EtkinlikTarihi)
                 {
                       this.EtkinlikTarihi=EtkinlikTarihi;
                 }

                 public String getEtkinlikLinki()
                  {
                       return EtkinlikLinki;
                  }


                 public void setEtkinlikLinki(String EtkinlikLinki)
                 {
                       this.EtkinlikLinki=EtkinlikLinki;
                 }

         }
