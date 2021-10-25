package com.Khaitq20041110035.kiemtragiuaki;

import java.util.Scanner;

public class DSLK2 {
    nodeapple2 head = null;
    nodeapple2 tail = null;
    Scanner nhap = new Scanner(System.in);
    public DSLK2(){}
    void addtail(){
       
        nodeapple2 newnode = new nodeapple2(){};

        if(head == null){
            head = newnode;
            tail = newnode;

        }else{
            tail.next = newnode;
            tail = newnode;
        }

    }
    void addHead(){
    nodeapple2 newNode = new nodeapple2() {
        
    };

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }}
        void removeTail(){
            nodeapple2 tam = head;
            if(head == null){
                System.out.println("- DANH SÁCH RỖNG");
                return;
            }
            while(tam != null){
                if(tam.next == tail){
                    tail = tam;
                    tail.next = null;
                    return;
                }
                tam = tam.next;
            }
        }
        void print(){
            nodeapple2 current =  head;
            if(head == null){
                System.out.println("danh sách rỗng ");
                return;
      
            }
            System.out.println("các nút trong danh sách");
            while(current != null){
                System.out.println(current.data);
                current = current.next;
      
            }
        
    
}}
