package com.Khaitq20041110035.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachsinhvien {
		private ArrayList<sinhvien> danhSach;
		
		public danhsachsinhvien() {
			this.danhSach = new ArrayList<sinhvien>();
		}
		
		public danhsachsinhvien(ArrayList<sinhvien> danhSach) {
			this.danhSach = danhSach;
		}
		
		// 1.	Thêm sinh viên vào danh sách.
		public void themSinhVien(sinhvien sv) {
			this.danhSach.add(sv);
		}
		
//		2.	In danh sách sinh viên ra màn hình.
		public void indanhsachsinhvien() {
			for (sinhvien sinhvien : danhSach) {
				System.out.println(sinhvien);
			}
		}
		
//		3.	Kiểm tra danh sách có rỗng hay không.
		//public boolean kiemTraDanhSachRong() {
		//	return this.danhSach.isEmpty();
	//	}
		
//		4.	Lấy ra số lượng sinh viên trong danh sách.
	//	public int laySoLuongSinhVien() {
	//		return this.danhSach.size();
	//	}
		
//		5.	Làm rỗng danh sách sinh viên.
	//	public void lamRongDanhSach() {
	//		this.danhSach.removeAll(danhSach);
	//	}
		
//		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
		public boolean kiemTraTonTai(sinhvien sv) {
			return this.danhSach.contains(sv);
		}
		
//		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
		public boolean xoaSinhVien(sinhvien sv) {
			return this.danhSach.remove(sv);
		}
		
//		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
		public void timSinhVien(String ten) {
			for (sinhvien sinhvien : danhSach) {
				if(sinhvien.getHoVaTen().indexOf(ten)>=0) {
					System.out.println(sinhvien);
				}
			}
		}
//		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
		public void sapXepSinhVienGiamDanTheoDiem() {
			Collections.sort(this.danhSach, new Comparator<sinhvien>() {
				@Override
				public int compare(sinhvien sv1, sinhvien sv2) {
					if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
						return 1;
					}else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
						return -1;
					}else {
						return 0;
					}
				}	
			});
		}
}