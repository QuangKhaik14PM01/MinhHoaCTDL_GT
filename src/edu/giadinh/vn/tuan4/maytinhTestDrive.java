package edu.giadinh.vn.tuan4;

import java.util.Scanner;

public class maytinhTestDrive {
    public static void main(String[] args) {
        Scanner mien4 = new Scanner(System.in);
        System.out.println("số lượng máy tính ");
        int n = mien4.nextInt();
        maytinh[] danhsachmaytinh = new maytinh[n];

        Scanner nhap4 = new Scanner(System.in);
        System.out.println("nhập danh sách máy tính ");
        for(int i = 0;i<danhsachmaytinh.length;i++){
            System.out.println("nhập máy tính thứ 1 " + (i+1));
            System.out.println("nhà sản xuất ");
            String nhasanxuat = nhap4.nextLine();
            System.out.println("năm sản xuất ");
            String namsanxuat = nhap4.nextLine();
            System.out.println("hệ điều hành ");
            String hedieuhanh = nhap4.nextLine();
            System.out.println("ram ");
            String ram = nhap4.nextLine();
            System.out.println("cpu ");
            String cpu = nhap4.nextLine();
            System.out.println("giá ");
            Double gia = nhap4.nextDouble();
            System.out.println("năm bảo hành ");
            String nambaohanh = nhap4.nextLine();
            nhap4.nextLine();

            danhsachmaytinh[i] = new maytinh(nhasanxuat, namsanxuat, hedieuhanh, ram, cpu, gia, nambaohanh);
        }
        System.out.println("===========in danh sách máy tính=============");
        for (maytinh maytinh : danhsachmaytinh){   
            maytinh.thongtinmaytinh();
    }
}  
}
