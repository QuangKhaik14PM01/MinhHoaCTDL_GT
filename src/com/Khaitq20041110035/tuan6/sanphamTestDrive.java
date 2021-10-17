package com.Khaitq20041110035.tuan6;

import java.util.Scanner;

public class sanphamTestDrive {
    public static void main(String[] args) {
    
       
        Scanner thamchieu = new Scanner(System.in);
        System.out.println("số lượng sản phẩm ");
         int n = thamchieu.nextInt();
         sanpham[] danhsachsanpham = new sanpham[n];


         Scanner nhaplieu = new Scanner(System.in);
         System.out.println("nhập danh sách sản phẩm ");
         for(int i = 0; i<danhsachsanpham.length;i++){
             System.out.println("nhập sản phẩm thứ 1 " + (i+1));
             System.out.println("tên sản phẩm");
             String tensanpham = nhaplieu.nextLine();
             System.out.println("đơn giá ");
             Double dongia = nhaplieu.nextDouble();
             System.out.println("giảm giá ");
             Double giamgia = nhaplieu.nextDouble();
             System.out.println("thuế nhập khẩu ");
             Double thuenhapkhau = nhaplieu.nextDouble();
             nhaplieu.nextLine();


             danhsachsanpham[i] = new sanpham(tensanpham, dongia, giamgia, thuenhapkhau );

         }
         System.out.println("=====in sản phẩm=====");
         for(sanpham sanpham : danhsachsanpham){
             sanpham.thongtinsanpham();
         }
    }
    
}
