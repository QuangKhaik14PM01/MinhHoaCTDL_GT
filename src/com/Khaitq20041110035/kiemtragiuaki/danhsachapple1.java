package com.Khaitq20041110035.kiemtragiuaki;

import java.util.ArrayList;


public class danhsachapple1 {
    private ArrayList<apple1> danhSach;
		
		public danhsachapple1() {
			this.danhSach = new ArrayList<apple1>();
		}
		
		public danhsachapple1(ArrayList<apple1> danhSach) {
			this.danhSach = danhSach;
		}
        // 1.	Thêm táo vào danh sách.
		public void themtao(apple1 sp) {
			this.danhSach.add(sp);
		
		}
		//2. In danh sách táo ra màn hình.
		public void indanhsachtao() {
			for (apple1 apple1 : danhSach) {
				System.out.println(apple1);
			}
		}
       // 3.	Tìm kiếm tất cả táo dựa trên màu sắc  được nhập từ bàn phím.
		public void timtao(String tensp) {
			for (apple1 apple1 : danhSach) {
				if(apple1.getmausac().indexOf(tensp)>=0) {
					System.out.println(apple1);
				}
			}
		}
        
    
}
