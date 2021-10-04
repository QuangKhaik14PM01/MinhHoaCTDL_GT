package com.Khaitq20041110035.tuan4;

public class sach {
    Double gia;
String nhasanxuat;
int namsanxuat;
Double giaban;
int soluong;
String loai;

   public sach(){}
   public sach(Double g, String nsx, int nsxt, Double gb, int sl, String l){
       gia = g;
       nhasanxuat = nsx;
       namsanxuat = nsxt;
       giaban = gb;
       soluong = sl;
       loai = l;
   }
   void thongtinsach(){
       System.out.println(" giá " + gia + "nhà sản xuất " + nhasanxuat + "năm sản xuất " + namsanxuat + "giá bán " + giaban + "số lượng " + soluong + "loại " + loai);
   }
}
