
package edu.giadinh.vn.tuan3;

import java.util.Scanner;

public class ChuongTrinhlab2bai4 {
    public static void main (String[] args){
        System.out.println("=========Menu=========");
        System.out.println(">>1. Giải phương trình bậc 1");
        System.out.println(">>2. Giải phương trình bậc 2");
        System.out.println(">>3. Tính tiền điện ");
        System.out.println("=========Menu=========");

        int suluachon;
        System.out.print("lựa chọn chức năng");
        Scanner biennhap;
        biennhap = new Scanner(System.in);   
        suluachon = biennhap.nextInt();

        switch(suluachon){
           case 1: giaiptbac1(); break;
           case 2: giaiptbac2(); break;
           case 3: tinhtiendien(); break;
           default: System.out.println("chọn chức năng khác");

        }

    }

    static void giaiptbac1(){
         System.out.println("triển khai code giải ptbac1....");

    }
    static void giaiptbac2(){
        System.out.println("triển khai code giải ptbac2....");
        
   }
   static void tinhtiendien(){
    System.out.println("triển khai code tính tiền điện ....");
   }
}
