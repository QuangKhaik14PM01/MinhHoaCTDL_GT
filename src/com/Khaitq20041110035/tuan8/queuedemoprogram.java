package com.Khaitq20041110035.tuan8;

import java.util.LinkedList;
import java.util.Queue;

public class queuedemoprogram {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();
        queue.add(8);
        queue.add(10);
        queue.add(2);
        // lấy ra 1 phần tử trong queue -  lấy đầu
       
        System.out.println(queue);
        int phantulayra =  queue.remove();
        System.out.println("phần tử lấy ra " + phantulayra);
        System.out.println("phần tử còn lại " + queue);
        // thăm 1 phần tử của queue - không lấy ra
       int tham =  queue.peek();
       System.out.println("thăm phần tử " + tham);
       System.out.println("còn lại " + queue);


        
            //cài đặt Linked List
        // thêm 1 phần tử ở cuối
        // lấy 1 phần đầu 
        //xoáy 1 phần tử ở đầu
            //cài đặt cấu trúc stack dùng LinkedList
          //cài đặt Linked List
        // thêm 1 phần tử ở cuối
        // lấy 1 phần cuối 
        //xoáy 1 phần tử ở cuối

    }
    
}
