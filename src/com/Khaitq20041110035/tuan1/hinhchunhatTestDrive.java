package com.Khaitq20041110035.tuan1;

public class hinhchunhatTestDrive {
    public static void main(String[] args) {
        hinhchunhat hinhchunhat = new hinhchunhat();
         
        // nhập chiều dài và chiều rộng hình chữ nhật
        hinhchunhat.nhap();
         
        // hiển thị chiều dài và chiều rộng
        hinhchunhat.hienThi(hinhchunhat.chieuDai, hinhchunhat.chieuRong);
         
        // tính chu vi và diện tích
        double chuVi = hinhchunhat.tinhChuVi(hinhchunhat.chieuDai, hinhchunhat.chieuRong);
        double dienTich = hinhchunhat.tinhDienTich(hinhchunhat.chieuDai, hinhchunhat.chieuRong);
         
        // hiển thị chu vi và diện tích
        hinhchunhat.hienThiChuViVaDienTich(chuVi, dienTich);
    }
 
    
}
