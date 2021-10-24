package com.Khaitq20041110035.tuan5;


import java.util.Scanner;

import com.Khaitq20041110035.tuan5.danhsachsanpham;
import com.Khaitq20041110035.tuan5.sanpham;

public class danhsachsanphamTestDrive {
    public static void main(String[] args) {
        Scanner kiemtra = new Scanner(System.in);
		
		danhsachsanpham dssp = new danhsachsanpham();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
			  "1.	Thêm sản phẩm vào danh sách.\n"
			+ "2.	Xuất danh sách sản phẩm từ cao đến thấp.\n"
			+ "3.	Tìm kiếm tất cả sản phẩm dựa trên Tên được nhập từ bàn phím.\n"
			+ "4.	Xóa một sản phẩm ra khỏi danh sách.\n"
            + "0.     thoát\n");
			luaChon = kiemtra.nextInt();
			kiemtra.nextLine();


            if(luaChon==1) {
                //				1.	Thêm sản phẩm vào danh sách.
                                System.out.println("Nhập mã tên sản phẩm: "); String tensanpham = kiemtra.nextLine();
                                System.out.println("Nhập đơn giá: "); Double dongia = kiemtra.nextDouble();
                                System.out.println("Nhập giảm giá: "); Double giamgia = kiemtra.nextDouble();
                                System.out.println("Nhập thuế nhập khẩu: "); Double thuenhapkhau = kiemtra.nextDouble();
                                sanpham sp = new sanpham(tensanpham, dongia, giamgia, thuenhapkhau);
                                dssp.themsanpham(sp);
                             
                             
                                
                            }else if(luaChon==2) {
                                //				9.	Xuất ra danh sách sản phẩm  từ cao đến thấp.
                                                dssp.sapxepdanhsach();
                                                dssp.indanhsachsanpham();

    }else if(luaChon==3) {
//				8.	Tìm kiếm tất cả sản phẩm dựa trên Tên được nhập từ bàn phím.
				System.out.println("Nhập sản phẩm: "); String tensanpham = kiemtra.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssp.timsanpham(tensanpham);
				
			}else if(luaChon==4) {
                //				7.	Xóa một sản phẩm ra khỏi danh sách
                                System.out.println("Nhập tên sản phẩm: "); String tensanpham = kiemtra.nextLine();
                                sanpham sp = new sanpham(tensanpham);
                                System.out.println("Xóa sinh viên trong danh sách: "+ dssp.xoasanpham(sp));
                            }
        }while(luaChon!=0);
} 
}
