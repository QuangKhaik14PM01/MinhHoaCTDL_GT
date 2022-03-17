package thigiuaky;

import java.util.Date;

public class GiaoDichDat  extends GiaoDich{
  
private String loaidat;
   private double thanhtien;

   public GiaoDichDat(){
       super();
       loaidat="";
   }
  public GiaoDichDat(String magiaodich, Date ngaygiaodich, int dientich,double dongia, String loaidat, double thanhtien){
    super(magiaodich, ngaygiaodich, dientich, dongia);
      this.loaidat=loaidat;
      this.thanhtien=thanhtien;
  }
public String getLoaidat() {
    return loaidat;
}
public void setLoaidat(String loaidat) {
    this.loaidat = loaidat;
}
public double getThanhtien() {
    return thanhtien;
}
public void setThanhtien(double thanhtien) {
    this.thanhtien = thanhtien;
}

  public void nhaploaidat(){
      System.out.println("nhập loại đất ");
      loaidat=nhap.nextLine();
  }

  public double thanhtien(){
      if(loaidat=="B"){
          return this.thanhtien=this.dientich*this.dongia;
      }if(loaidat=="C"){
          return this.thanhtien=this.dientich*this.dongia;
      }if(loaidat=="A"){
          return this.thanhtien=this.dientich*this.dongia*1.5;

      
      }else{
          System.out.println("không tính ");
        return thanhtien=0;
      }
    

      }
  public String toSring(){
      return "Giao dịch đất " +super.toString() + "loại đất " + this.loaidat + "thành tiền " + this.thanhtien;

  }

  }
    
    
    
    

