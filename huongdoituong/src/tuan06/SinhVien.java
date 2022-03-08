package tuan06;

import tuan1.sinhvien;

public class SinhVien {
    private int mssv;
    private  String ten;
    private  float diemLH;
    private   float diemTH;

    public SinhVien(){}
    public SinhVien(int mssv, String ten, float diemLH, float diemTh){
             this.mssv=mssv;
             this.ten=ten;
             this.diemLH=diemLH;
             this.diemTH=diemTh;
    } 
    public int getmssv(){
          return mssv;
      }
      public void setmssv(int mssv){
          this.mssv=mssv;
      }
      public String ten(){
        return ten;
    }
    public void setten(String ten){
        this.ten=ten;
    }
    public float getdiemLH(){
        return diemLH;
    }
    public void setdiemLH (float diemLH ){
        this.diemLH=diemLH;
    }
    public float getdiemTH (){
        return diemTH;
    }
    public void setdiemTH (float diemTH){
        this.diemTH=diemTH;
    }


    public float tinhdiemtrungbinh(){
        return(this.diemLH + this.diemTH)/2;


    }
public String to_String(){
             String string="mssv " + this.mssv + "ten " + this.ten + " diemLH " + this.diemLH + "diemTH " + this.diemTH+" diem trung binh " + tinhdiemtrungbinh();
             
             return  string;
         }
    
}
