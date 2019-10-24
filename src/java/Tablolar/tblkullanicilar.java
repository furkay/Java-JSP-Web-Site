package Tablolar;

    public class tblkullanicilar
         {

                 private int pkKulllaniciID; 
                 private String KullaniciAdi; 
                 private String Sifre; 

                 public int getpkKulllaniciID()
                  {
                       return pkKulllaniciID;
                  }


                 public void setpkKulllaniciID(int pkKulllaniciID)
                 {
                       this.pkKulllaniciID=pkKulllaniciID;
                 }

                 public String getKullaniciAdi()
                  {
                       return KullaniciAdi;
                  }


                 public void setKullaniciAdi(String KullaniciAdi)
                 {
                       this.KullaniciAdi=KullaniciAdi;
                 }

                 public String getSifre()
                  {
                       return Sifre;
                  }


                 public void setSifre(String Sifre)
                 {
                       this.Sifre=Sifre;
                 }

         }
