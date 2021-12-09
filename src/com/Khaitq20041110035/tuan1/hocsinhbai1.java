package com.Khaitq20041110035.tuan1;

public class hocsinhbai1 {
    String hovaten;
    Double diem;
    Double diemtb;

    public  hocsinhbai1(){}
    public  hocsinhbai1(String hvt, Double d, Double dtb){
        hovaten = hvt;
        diem = d;
        diemtb = dtb;
    }

    void thongtinhocsinh(){
        System.out.println("họ và tên "  + hovaten + "diểm " + diem + "điểm trung bình " + diemtb);
    }
    
}
