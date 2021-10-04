package com.Khaitq20041110035.tuan2;

public class sinhvienTestDrive {
    public static void main(String[] args) {
        sinhvien sinhvien;//khai báo biến tên là sinh viên tham chiếu đối tượng kiểu sinhvien

        sinhvien = new sinhvien();//tạo đổi tượng sinh viên trong vùng nhớ heap
        sinhvien.mssv = "2004110035";
        sinhvien.tensinhvien = "Trần Quang Khải";
        sinhvien.quequan = "TP. Hồ Chí Minh";
        sinhvien.tuoi = 18;
        
        

        sinhvien.inthongtinsv();
    }
    
}
