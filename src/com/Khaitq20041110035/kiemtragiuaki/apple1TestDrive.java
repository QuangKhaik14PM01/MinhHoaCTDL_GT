package com.Khaitq20041110035.kiemtragiuaki;


import java.util.Scanner;
import com.Khaitq20041110035.kiemtragiuaki.apple1;
import com.Khaitq20041110035.kiemtragiuaki.danhsachapple1;
public class apple1TestDrive {
    public static void main(String[] args) {
        Scanner kiemtratao = new Scanner(System.in);
		
		danhsachapple1 dst = new danhsachapple1();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
			  "1.	Thêm táo vào danh sách.\n"
			+ "2.	In táo.\n"
			+ "3.	Tìm kiếm táo dựa trên màu được nhập từ bàn phím.\n"
            + "0.     thoát\n");
			
            luaChon = kiemtratao.nextInt();
			kiemtratao.nextLine();
            
            if(luaChon==1) {
                //				1.	Thêm sản phẩm vào danh sách.
                                System.out.println("Nhập mã id: "); Double maid = kiemtratao.nextDouble();
                                System.out.println("Nhập khối lượng: "); Double khoiluong = kiemtratao.nextDouble();
                                System.out.println("Nhập màu: "); String mausac = kiemtratao.nextLine();
                                kiemtratao.nextLine();
                               
                                apple1 sp = new apple1(maid,khoiluong,mausac);
                                dst.themtao(sp);
            }else if(luaChon==2) {
                //				2.	In danh sách sinh viên ra màn hình.
                                dst.indanhsachtao();
                                kiemtratao.nextLine();
                                
            }else if(luaChon==3) {
                //				8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
                                System.out.println("Nhập màu sắc: "); String mausac = kiemtratao.nextLine();
                                System.out.println("Kết quả tìm kiếm: "+ mausac);
                                dst.timtao(mausac);
                                kiemtratao.nextLine();
                                
                            }
                        }while(luaChon!=0);
                        
                             

                        }
    
}
