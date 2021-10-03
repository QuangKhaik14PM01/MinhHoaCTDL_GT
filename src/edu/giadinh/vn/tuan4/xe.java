package edu.giadinh.vn.tuan4;

public class xe {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    Double dungtich;
    
    public xe(){}
    public xe(String t, String hsx,String d, String gp, Double dt){
              tenchuxe = t;
              hangsanxuat = hsx;
              dong = d;
              giayphep = gp;
              dungtich = dt;

    }
    void thongtinxe(){
        System.out.println("tên chủ xe " + tenchuxe + "hãng sản xuất " + hangsanxuat + "giấy phép " + giayphep + "dung tích " + dungtich);
    }
    
}
