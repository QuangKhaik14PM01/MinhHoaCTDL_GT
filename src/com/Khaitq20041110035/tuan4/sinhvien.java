package com.Khaitq20041110035.tuan4;

public class sinhvien {
    public String mssv;
     public String hoten;
     public int tuoi;
    public String quequan;

    public sinhvien(){}
    public sinhvien(String m, String h, int t, String q){
        mssv = m;
        tuoi = t;
        hoten = h;
        quequan = q;

    }
    void thongtinsinhvien(){
        System.out.println("mã sinh viên = " + mssv  + "họ tên = " + hoten + "tuổi = " + tuoi + "quê quán = " + quequan );
    }

}
