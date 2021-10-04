package com.Khaitq20041110035.tuan4;

public class taikhoan {
    String tentaikhoan;
    String sotaikhoan;
    Double sodutaikhoan;

    public taikhoan(){}
    public taikhoan(String ttk, String stkk, Double sdtk){
        tentaikhoan = ttk;
        sotaikhoan = stkk;
        sodutaikhoan = sdtk;
    }
    void thongtintaikhoan(){
        System.out.println("tên tài khoản " + tentaikhoan + "số tài khoản " + sotaikhoan + "số dư tài khoản " + sodutaikhoan);
    }
    
}
