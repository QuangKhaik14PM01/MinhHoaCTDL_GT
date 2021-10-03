package edu.giadinh.vn.tuan4;

import java.util.Scanner;

public class sachTestDrive {
    
    public static void main(String[] args) {
        
        Scanner mien1 = new Scanner(System.in);
        System.out.println("Số lượng sách cần nhập ");
        int n = mien1.nextInt();
        sach[] danhsachsach = new sach[n];

        Scanner nhap1 = new Scanner(System.in);
        System.out.println("Nhập danh sách sách ");
        for(int i = 0; i<danhsachsach.length; i++){
            System.out.println("nhập sách thứ 1 " + (i+1));
            System.out.println("Gía ");
            Double gia = nhap1.nextDouble();
            System.out.println("Nhà sản xuất ");
            String nhasanxuat = nhap1.nextLine();
            System.out.println("Năm sản xuất ");
            int namsanxuat = nhap1.nextInt();
            System.out.println("Giá bán ");
            Double giaban = nhap1.nextDouble();
            System.out.println("Số lượng ");
            int soluong = nhap1.nextInt();
            System.out.println("Loại ");
            String loai = nhap1.nextLine();
            nhap1.nextLine();

            danhsachsach[i] = new sach(gia, nhasanxuat, namsanxuat, giaban, soluong, loai);
        }
        System.out.println("===========in danh sách sách=============");
        for (sach sach : danhsachsach){   
            sach.thongtinsach();
        }

    }
}
