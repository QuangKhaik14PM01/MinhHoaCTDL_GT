package com.Khaitq20041110035.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachsanpham {
    
    private ArrayList<sanpham> danhSach;
		
		public danhsachsanpham() {
			this.danhSach = new ArrayList<sanpham>();
		}
		
		public danhsachsanpham(ArrayList<sanpham> danhSach) {
			this.danhSach = danhSach;
		}
        // 1.	Thêm sản phẩm vào danh sách.
		public void themsanpham(sanpham sp) {
			this.danhSach.add(sp);
		//Collections.shuffle(danhSach);
		}
		//In danh sách sản phẩm ra màn hình.
		public void indanhsachsanpham() {
			for (sanpham sanpham : danhSach) {
				System.out.println(sanpham);
			}
		}

        //2.	Xuất ra danh sách sản phẩm  có giá từ cao đến thấp.
		public void sapxepdanhsach() {
			Collections.sort(this.danhSach, new Comparator<sanpham>() {
				@Override
				public int compare(sanpham sp1, sanpham sp2) {
					if(sp1.getdongia()<sp2.getdongia()) {
						return 1;
					}else if(sp1.getdongia()>sp2.getdongia()) {
						return -1;
					}else {
						return 0;
					}
				}	
			});
		}
         //		3.	Tìm kiếm tất cả sản phẩm dựa trên Tên được nhập từ bàn phím.
		public void timsanpham(String tensp) {
			for (sanpham sanpham : danhSach) {
				if(sanpham.gettensanpham().indexOf(tensp)>=0) {
					System.out.println(sanpham);
				}
			}
		}
        
//		4.	Xóa một sản phẩm ra khỏi danh sách
		public boolean xoasanpham(sanpham sp) {
			return this.danhSach.remove(sp);
		}

}
