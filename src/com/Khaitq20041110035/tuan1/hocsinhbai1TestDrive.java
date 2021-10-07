package com.Khaitq20041110035.tuan1;

import java.util.Scanner;

public class hocsinhbai1TestDrive {
    public static void main(String[] args) {
        Scanner hocsinh = new Scanner(System.in);
        System.out.println("số lượng máy tính ");
        int n = hocsinh.nextInt();
        hocsinhbai1[] danhsachhocsinh = new hocsinhbai1[n];

        Scanner nhaphocsinh = new Scanner(System.in);
        System.out.println("nhập danh sách học sinh ");
        for(int i = 0;i<danhsachhocsinh.length;i++){
            System.out.println("nhập học sinh thứ 1 " + (i+1));
            System.out.println("họ và tên ");
            String hovaten = nhaphocsinh.nextLine();
            System.out.println("điểm ");
            Double diem = nhaphocsinh.nextDouble();
            System.out.println("điểm trung bình ");
            Double diemtb = nhaphocsinh.nextDouble();
            nhaphocsinh.nextLine();
            
            danhsachhocsinh[i] = new hocsinhbai1(hovaten, diem, diemtb);    
        }
        System.out.println("===========in danh sách học sinh=============");
        for (hocsinhbai1 hocsinhbai1 : danhsachhocsinh){   
            hocsinhbai1.thongtinhocsinh();
    }
}
}
