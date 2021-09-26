package edu.giadinh.vn.tuan2;

import java.util.Date;

public class sinhvien {
    
        
     //1 thuộc tính attribute
    String mssv;
    String tensinhvien;
    boolean gioitinh;//false
    int tuoi;
    String quequan;
    Date ngaysinh;// ngày tháng


    //2 phương thức method - function
    //<kiểu trả về><tên hàm><danh sách tham số>{........}
    void inthongtinsv(){
        System.out.println("mã số sinh viên " + mssv);
        System.out.println("tên sinh viên " + tensinhvien);
        System.out.println("quê quán " + quequan);
        System.out.println("ngày sinh " + ngaysinh);
        System.out.println("tuổi" + tuoi);
        System.out.println("giới tính " +gioitinh);

    }
    
}
