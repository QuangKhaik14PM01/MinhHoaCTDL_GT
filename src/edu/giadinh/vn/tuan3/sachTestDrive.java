package edu.giadinh.vn.tuan3;

public class sachTestDrive {

    public static void main(String[] args) {
        sach sach;

        sach = new sach();
        sach.giaban = 20000;
        sach.loai = "sách giáo khoa";
        sach.nhaxuatban = "kim đồng";
        sach.soluong = "hơn 3000 sách";
        sach.namxuatban = 2000;

        sach.thongtinsach();
    }
    
}
