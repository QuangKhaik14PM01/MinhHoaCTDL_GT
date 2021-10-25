package com.Khaitq20041110035.kiemtragiuaki;

public class nodeapple2 {
    int data;
    Double maid;
    Double khoiluong;
    String mausac;
    nodeapple2 next;
    public nodeapple2(){}
    public nodeapple2(int d, Double m, Double kl, String mau){
        data=d;
        maid=m;
        khoiluong=kl;
        mausac= mau;
        next =null;
    }
    public nodeapple2(int d, nodeapple2 n,Double m, Double kl, String mau){

        next = n;
        data = d;
        maid=m;
        khoiluong=kl;
        mausac= mau;
    }


    
}
