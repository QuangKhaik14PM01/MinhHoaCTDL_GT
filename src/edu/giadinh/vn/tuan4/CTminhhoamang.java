package edu.giadinh.vn.tuan4;

import java.util.Arrays;

public class CTminhhoamang {
    public static void main(String[] args) {
        // cú pháp khai báo mảng
        int[] mangsonguyen;//chưa chỉ định số phần tử - phải chỉ định số phần tử trước khi dùng
        mangsonguyen = new int[5];//mảng trong java là 1 kiểu tham chiếu đối tượng

        double mangsothuc[] = new double[10];


           
        //trước khi dùng phải xác định số phần tử của mảng
        mangsonguyen[0] = 2;

        //khai báo có khởi tạo giá trị cho mảng
        
        double diemmonhoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
        System.out.println("mảng điểm môn học " + Arrays.toString(diemmonhoc));

        diemmonhoc[0] = diemmonhoc[1];
        //5.5, 5.5, 3.0, 4.5
        System.out.println("mảng điểm môn học " + Arrays.toString(diemmonhoc));
        System.out.println("số phần tử của mảng điểm môn học " + diemmonhoc.length); 

        //CÁCH 2
        String dstensinhvien[] = {"Tèo", "Tý", "Tửng"};

        //dùng vòng lặp để duyệt mảng
        System.out.println("==========DUYỆT MẢNG=========");
        for(int i = 0; i < diemmonhoc.length; i++){
            System.out.println(diemmonhoc[i]);
        }
        System.out.println("===========for each==========");
         //FOR-EACH
         for(double diem : diemmonhoc){
             System.out.println(diem);
         }
         //mảng có kiểu dữ liệu tham chiếu đối tượng
         dog[] danhsachdog = new dog[7];
         dog dog0 = new dog(10, "đen", "fido");
         dog dog1 = new dog(7, "vàng", "la la");
         dog dog2 = new dog(25, "đen trắng", "lulu");
         dog dog3 = new dog(15, "boo", "bee");
         dog dog4 = new dog(21, "bơ", "bin");
         dog dog5 = new dog(24, "bu", "lu");
         dog dog6 = new dog(35, "mina", "meosenpai");
         
       
         danhsachdog[0] = dog0;
         danhsachdog[2] = dog2;
         danhsachdog[3] = dog1;
         danhsachdog[1] = dog3;
         danhsachdog[4] = dog4;
         danhsachdog[5] = dog5;
         danhsachdog[6] = dog6;

           danhsachdog[1] = new dog(55, "xám", "nanh trắng");
         for(int i = 0;i < danhsachdog.length; i++){
            danhsachdog[i].inthongtin(); 
         }
         



    }
    
}
