package com.Khaitq20041110035.tuan4;

import java.util.Scanner;

public class taikhoanTestDrive {
    public static void main(String[] args) {
        Scanner mien5 = new Scanner(System.in);
        System.out.println("số lượng tài khoản ");
        int n = mien5.nextInt();
        taikhoan[] danhsachtaikhoan = new taikhoan[n];

        Scanner nhap5 = new Scanner(System.in);
        System.out.println("nhập danh sách tài khoản ");
        for (int i =0; i<danhsachtaikhoan.length;i++){
            System.out.println("nhập tài khoản thứ 1 " + (i+1));
            System.out.println("tên tài khoản ");
            String tentaikhoan = nhap5.nextLine();
            System.out.println("số tài khoản ");
            String sotaikhoan = nhap5.nextLine();
            System.out.println("số dư tài khoản ");
            Double sodutaikhoan = nhap5.nextDouble();
            nhap5.nextLine();

            danhsachtaikhoan[i] = new taikhoan(tentaikhoan, sotaikhoan, sodutaikhoan);

        }
        System.out.println("===========in danh sách tài khoản=============");
        for (taikhoan taikhoan : danhsachtaikhoan){   
            taikhoan.thongtintaikhoan();
    }

    }
    
}
