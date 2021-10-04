package com.Khaitq20041110035.tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class sinhvienTestDrive {
    public static void main(String[] args) {
        Scanner mien = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên ");
        int n = mien.nextInt();
        sinhvien[] danhsachsv = new sinhvien[n];

        Scanner nhap = new Scanner(System.in);
    
    
        System.out.println("Nhập danh sách sinh viên");
        for(int i = 0; i < danhsachsv.length; i++){
            System.out.println("nhập sinh viên thứ"+ (i+1));
            System.out.println("mã sinh viên ");
            String mssv = nhap.nextLine();
            System.out.println("Tên sinh viên ");
            String hoten = nhap.nextLine();
            System.out.println("tuổi ");
            int tuoi = nhap.nextInt();
            System.out.println("quê quán ");
            String quequan = nhap.nextLine();
            nhap.nextLine(); 

            danhsachsv[i] = new sinhvien(mssv, hoten, tuoi, quequan );
        }
        System.out.println("===========in danh sách sinh viên=============");
        for (sinhvien sinhvien : danhsachsv){   
            sinhvien.thongtinsinhvien();
        }
        
   // List list = Arrays.asList(danhsachsv); 
    // BỘ SO SÁNH
    //Comparator comparator = new Comparator<sinhvien>(){

      //  @Override
        //public int compare(sinhvien o1,sinhvien o2){
            //TODO Auto-generated method stub
          //  return Integer.compare(o1.tuoi, o2.tuoi) ;
        //}
        
    //};
    
    //list.sort(comparator);//truyền bộ so sánh vào
    //System.out.println("===========in danh sách sinh viên sau khi so sánh =============");
      //  for (sinhvien sinhvien : danhsachsv){
        //    sinhvien.thongtinsinhvien();
        //}
}
}
