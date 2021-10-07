package com.Khaitq20041110035.tuan5;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String>a = new ArrayList<String>();
        a.add("cường");
        a.add("tuấn");
        a.add("phương");
        a.add("hạnh");

        String s = a.get(2);
        System.out.println(s);
        //<type> là kiểu dữ liệu kh phải kiểu nguyên thủy(phải sử dụng wrapper)
    }
    
}
