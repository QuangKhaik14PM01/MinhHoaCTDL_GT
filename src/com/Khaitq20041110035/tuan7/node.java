package com.Khaitq20041110035.tuan7;

public class node {
    // nội dung

    int data;
    // phần liên kết đến nút tiếp theo
    // tham chiếu 

    node next;// biến tham chiếu kiểu node

    public node(){}

    public node(int d){
        data = d;
        next = null;

    }

    public node(int d, node n){

        next = n;
        data = d;
    }

    

    
}
