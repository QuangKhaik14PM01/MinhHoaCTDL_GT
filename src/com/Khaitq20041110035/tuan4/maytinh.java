package com.Khaitq20041110035.tuan4;

public class maytinh {
    String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String cpu;
    Double gia;
    String nambaohanh;

    public maytinh(){}
    public maytinh(String nsx, String nsxx, String hdh, String r, String c, Double g, String nbh ){
        nhasanxuat = nsx;
        namsanxuat = nsxx;
        hedieuhanh = hdh;
        ram = r;
        cpu = c;
        gia = g;
        nambaohanh = nbh;
    }
    void thongtinmaytinh(){
        System.out.println("nhà sản xuất " + nhasanxuat + "năm sản xuất " + namsanxuat + "hệ điều hành " + hedieuhanh + "ram" + ram + "cpu " + cpu + "giá " + gia + "năm bảo hành " + nambaohanh);
    }
}
