package com.Khaitq20041110035.tuan4;

import java.util.Scanner;

public class xeTestDrive {
    public static void main(String[] args) {
        Scanner mien3 = new Scanner(System.in);
        System.out.println("số lượng xe ");
        int n = mien3.nextInt();
        xe[] danhsachxe = new xe[n];

        Scanner nhap3 = new Scanner(System.in);
        System.out.println("nhập danh sách xe ");
        for(int i = 0;i<danhsachxe.length;i++){
            System.out.println("nhập xe thứ 1 " + (i+1));
            System.out.println("tên chủ xe ");
            String tenchuxe = nhap3.nextLine();
            System.out.println("hãng sản xuất ");
            String hangsanxuat = nhap3.nextLine();
            System.out.println("dòng ");
            String dong = nhap3.nextLine();
            System.out.println("giấy phép ");
            String giayphep = nhap3.nextLine();
            System.out.println("dung tích ");
            Double dungtich = nhap3.nextDouble();
            nhap3.nextLine();

            danhsachxe[i] = new xe(tenchuxe, hangsanxuat, dong, giayphep, dungtich);
        }
        System.out.println("===========in danh sách xe=============");
        for (xe xe : danhsachxe){   
            xe.thongtinxe();
        }
    }
}