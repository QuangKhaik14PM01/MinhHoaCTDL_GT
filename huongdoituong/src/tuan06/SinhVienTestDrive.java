package tuan06;

import java.util.Scanner;

import tuan1.sinhvien;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien(20004, "tr", 9.2f, 7.4f);
        SinhVien sinhVien3 = new SinhVien(2005, "trrt", 2.2f, 5.4f);


        
       System.out.println("nhap mssv ");
       int mssv = nhap.nextInt();
       sinhVien1.setmssv(mssv);

       System.out.println("nhap ten ");
      String ten = nhap.nextLine();
       sinhVien1.setten(ten);
       nhap.nextLine();

       System.out.println("diem lh  ");
       float diemLH = nhap.nextFloat();
       sinhVien1.setdiemLH(diemLH);


       System.out.println("diem TH ");
       float diemTH = nhap.nextFloat();
       sinhVien1.setdiemTH(diemTH);


       System.out.println(sinhVien1.to_String());
       System.out.println(sinhVien2.to_String());
       System.out.println(sinhVien3.to_String());

       nhap.close();


    }
    
}
