package com.Khaitq20041110035.tuan5;

import java.util.Scanner;

import com.Khaitq20041110035.tuan5.danhsachsinhvien;
import com.Khaitq20041110035.tuan5.sinhvien;

public class danhsachsinhvienTestDrive {
	public static void main(String[] args) {
		Scanner kiem = new Scanner(System.in);
		
		danhsachsinhvien dssv = new danhsachsinhvien();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
			  "1.	Thêm sinh viên vào danh sách.\n"
			+ "2.	In danh sách sinh viên ra màn hình.\n"
			+ "3.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
			+ "4.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
			+ "5.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
			+ "6.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
			+ "0.   Thoát khỏi chương trình");
			luaChon = kiem.nextInt();
			kiem.nextLine();
			
			if(luaChon==1) {
//				1.	Thêm sinh viên vào danh sách.
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = kiem.nextLine();
				System.out.println("Nhập họ và tên: "); String hoVaTen = kiem.nextLine();
				System.out.println("Nhập năm sinh: "); int namSinh = kiem.nextInt();
				System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = kiem.nextFloat();
				sinhvien sv = new sinhvien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				
			}else if(luaChon==2) {
//				2.	In danh sách sinh viên ra màn hình.
				dssv.indanhsachsinhvien();
				
			}else if(luaChon==3) {
//				6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = kiem.nextLine();
				sinhvien sv = new sinhvien(maSinhVien);
				System.out.println("Kiếm tra sinh viên có trong danh sách: "+dssv.kiemTraTonTai(sv));
			}else if(luaChon==4) {
//				7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = kiem.nextLine();
				sinhvien sv = new sinhvien(maSinhVien);
				System.out.println("Xóa sinh viên trong danh sách: "+dssv.xoaSinhVien(sv));
			}else if(luaChon==5) {
//				8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
				System.out.println("Nhập họ và tên: "); String hoVaTen = kiem.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.timSinhVien(hoVaTen);
				
			}else if(luaChon==6) {
//				9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.indanhsachsinhvien();
			}
		}while(luaChon!=0);
	}
}
