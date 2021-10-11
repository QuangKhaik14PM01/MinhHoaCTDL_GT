package com.Khaitq20041110035.tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5bai1 {
    public static void main(String[] args) {
        int n;
        double number, sum = 0;
        ArrayList<Double> arrListDouble = new ArrayList<>();
        Scanner Scanner =  new Scanner(System.in);
             
        System.out.println("Nhập vào số phần tử của ArrayList: ");
        n =  Scanner.nextInt();
             
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number =  Scanner.nextDouble();
            arrListDouble.add(number);
        }
             
        // tính tổng các phần tử của arrListDouble
        for (double element : arrListDouble) {
            sum += element;
        }   
        System.out.println("Tổng của các phần tử trong arrListDouble = " + sum);
    }
    
}
