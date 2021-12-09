package com.Khaitq20041110035.tuan5;

import java.util.ArrayList;
import java.util.List;


import com.Khaitq20041110035.tuan4.dog;
import com.Khaitq20041110035.tuan4.sinhvien;

public class ctminhhoaarraylist {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("cường");
        a.add(true);
        a.add(1);
       
        a.add(new dog(22, "vàng", "figo"));
        dog dog = (dog)a.get(2);
        
        System.out.println("dog name " + dog.name + "color" + dog.color);
        a.add(2.5);
        a.add(5);
        System.out.println(a.get(0));

        //Integer x = (Integer)a.get(2);
        //for (Object object : a){
          //  System.out.println(a);
        //}
         
        List bienTCArrayList = new ArrayList();
        bienTCArrayList.add(new sinhvien("2004110035", "trần quang khải", 18, "tp hồ chí minh"));
        //lấy 1 phần tử từ list
        sinhvien sinhvien = (sinhvien)bienTCArrayList.get(0);
        System.out.println(bienTCArrayList);



        List<String> liststrings = new ArrayList<>();
        // liststrings.add(1);
        liststrings.add("mr tèo");

        ArrayList<sinhvien> asinhviens = new  ArrayList<>();
        //asinhviens.add("mr tèo");
        //sinhvien sinhvien2 = new sinhvien();
       // asinhviens.add(sinhvien2);
        asinhviens.add(new sinhvien());
    }
    
}
