package com.Khaitq20041110035.tuan6;

public class sanpham {
    String tensanpham;
    Double dongia;
    Double giamgia;
    Double thuenhapkhau;


    public sanpham(){}
    public sanpham(String t, Double d, Double g, Double tn){
        tensanpham = t;
        dongia = d;
        giamgia = g;
        thuenhapkhau = tn;
    }

    void thongtinsanpham(){
        System.out.println("tên sản phẩm " + tensanpham + "dongia " + dongia + "giảm giá " + giamgia + "thuế nhập khẩu " + thuenhapkhau);
    }
     
   
    
}
