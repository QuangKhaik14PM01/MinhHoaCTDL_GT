package com.Khaitq20041110035.tuan4;

public class nhanvien {
    String tennhanvien;
    Double luong;
    String diachi;
    String bophanlamviec;
    

    public nhanvien(){}
    public nhanvien(String t, Double l, String dc, String bplv ){
        tennhanvien = t;
        luong  = l;
        diachi = dc;
        bophanlamviec = bplv;
    }
    void thongtinnhanvien(){
        System.out.println("tên nhân viên " + tennhanvien + "lương " + luong + "địa chỉ " + diachi + "bộ phận làm việc " + bophanlamviec);
    }
    
}
