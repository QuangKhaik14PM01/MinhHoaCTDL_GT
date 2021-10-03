package edu.giadinh.vn.tuan4;

public class sinhvien {
    String mssv;
    String hoten;
    int tuoi;
    String quequan;

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
