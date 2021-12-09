package com.Khaitq20041110035.tuan8;

import java.util.Stack;

import com.Khaitq20041110035.tuan2.sinhvien;

public class programdemo {
    public static void main(String[] args) {
        Stack<String> stack;

        stack= new Stack<>();
        // thêm phần tử vào stack
        stack.push("welcome");
        stack.push("to");
        stack.push("data structure and algotithm");
        System.out.println(stack);
        // lấy ra 1 phần tử từ đỉnh stack(xóa phần tử khỏi stack)
        String poped = stack.pop();
        System.out.println("đã lấy ra từ danh sách stack " + poped);
        System.out.println("phần tử trong danh sách còn lại của stack ");
        System.out.println(stack);
        //thăm đỉnh
        String phantuduoctham = stack.peek();
        System.out.println("thăm phần tử trong stack " + phantuduoctham);
        //sau khi thăm
        System.out.println(stack);



        Stack<sinhvien> stack2;
    }
    
}
