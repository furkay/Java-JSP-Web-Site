package Tablolar;

    public class tblicerik
         {

                 private int pkIcerikID; 
                 private String IcerikIsim; 
                 private String IcerikAciklama; 
                 private String Resim; 
                 private String Konu; 

                 public int getpkIcerikID()
                  {
                       return pkIcerikID;
                  }


                 public void setpkIcerikID(int pkIcerikID)
                 {
                       this.pkIcerikID=pkIcerikID;
                 }

                 public String getIcerikIsim()
                  {
                       return IcerikIsim;
                  }


                 public void setIcerikIsim(String IcerikIsim)
                 {
                       this.IcerikIsim=IcerikIsim;
                 }

                 public String getIcerikAciklama()
                  {
                       return IcerikAciklama;
                  }


                 public void setIcerikAciklama(String IcerikAciklama)
                 {
                       this.IcerikAciklama=IcerikAciklama;
                 }

                 public String getResim()
                  {
                       return Resim;
                  }


                 public void setResim(String Resim)
                 {
                       this.Resim=Resim;
                 }

                 public String getKonu()
                  {
                       return Konu;
                  }


                 public void setKonu(String Konu)
                 {
                       this.Konu=Konu;
                 }

         }
