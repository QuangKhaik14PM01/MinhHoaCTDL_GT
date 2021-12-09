package com.Khaitq20041110035.tuan7;

import java.util.Scanner;

public class mylinklist {
    node head = null;
    node tail = null;
    Scanner nhap = new Scanner(System.in);
    

    public mylinklist(){}
    void addtail(int data){
        // tạo 1 node mới
        node newnode = new node(data);

        if(head == null){
            head = newnode;
            tail = newnode;

        }else{
            tail.next = newnode;
            tail = newnode;
        }

    }
    void addHead(int data){
    node newNode = new node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }}

        void removeHead(){
            node tam = head;
            if(head == null){
                System.out.println("- DANH SÁCH RỖNG");
                return;
            }
                head = tam.next;
        }
        void removeTail(){
            node tam = head;
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
        void remove(int n){
            node tam1 = head;
            node tam2 = null;
            if(tam1 != null && tam1.data == n){
                removeHead();
                return;
            }
            if(tam1 != null && tail.data == n){
                removeTail();
                return;
            }
            while(tam1 != null){
                tam2 = tam1;
                tam1 = tam1.next;
                if(tam1.data == n){
                    tam2.next = tam1.next;
                    return;
                }
            }
        }

    void print(){
      node current =  head;
      if(head == null){
          System.out.println("danh sách rỗng ");
          return;

      }
      System.out.println("các nút trong danh sách");
      while(current != null){
          System.out.println(current.data);
          current = current.next;

      }

    }
    void add(int data, int n){
       
        node current = head;
        if(head.data == n){
            addHead(data);
            return;
        }
        while(current.next != null){
            if(current.next.data == n){
                node t = new node(data);
                t.next = current.next;
                current.next = t;
                return;
            }
            current = current.next;
        }   
    }
    void find(){
        

    }
    
    void sua(int n, int t){
        node current = head;
        while(current != null){
            if(current.data == n)
                current.data = t;
            current = current.next;
        }
    }
}
