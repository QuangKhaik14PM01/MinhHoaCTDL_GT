package com.Khaitq20041110035.tuan7;

public class mylinklist {
    node head = null;
    node tail = null;
    

    public mylinklist(){}
    void add(int data){
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

    void remove(){

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
    void find(){
        

    }
    
}
