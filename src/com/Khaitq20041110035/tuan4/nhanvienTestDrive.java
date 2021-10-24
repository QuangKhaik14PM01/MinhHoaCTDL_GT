package com.Khaitq20041110035.tuan4;

import java.util.Scanner;

public class nhanvienTestDrive {
    public static void main(String[] args) {
        Scanner mien2 = new Scanner(System.in);
        System.out.println("số lượng nhân viên ");
        int n = mien2.nextInt();
        nhanvien[] danhsachnhanvien = new nhanvien[n];
        
        Scanner nhap2 = new Scanner(System.in);
        System.out.println("nhập danh sách nhân viên ");
        for(int i = 0; i<danhsachnhanvien.length; i++){
            System.out.println("nhập nhân viên thứ 1 " + (i+1));
            System.out.println("tên nhân viên ");
            String tennhanvien = nhap2.nextLine();
            System.out.println("lương ");
            Double luong = nhap2.nextDouble();
            System.out.println("địa chỉ ");
            String diachi = nhap2.nextLine();
            System.out.println("bộ phận làm việc ");
            String bophanlamviec = nhap2.nextLine();
            nhap2.nextLine();

            danhsachnhanvien[i] =  new nhanvien(tennhanvien,     luong, diachi, bophanlamviec); 
    
        }
        System.out.println("===========in danh sách sách=============");
        for (nhanvien nhanvien : danhsachnhanvien){   
            nhanvien.thongtinnhanvien();
        }
    }

    
}
