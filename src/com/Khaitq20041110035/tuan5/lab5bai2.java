package com.Khaitq20041110035.tuan5;

import java.util.ArrayList;

import java.util.Collections;

public class lab5bai2 {
    public static void main(String[] args) {
        ArrayList<String> hoten = new ArrayList<>();

        hoten.add("A");
        hoten.add("B");
        hoten.add("C");
        hoten.add("D");
        System.out.println(hoten);

        Collections.shuffle(hoten);

        System.out.println(hoten);

    }
}
