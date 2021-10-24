package com.Khaitq20041110035.tuan7;

public class mylinklistTestDrive {
    public static void main(String[] args) {
       mylinklist mylinklist = new mylinklist();
       mylinklist.addHead(4);
       mylinklist.addtail(3);
       mylinklist.addtail(8);
      
      
       mylinklist.add(6,0);
       mylinklist.add(8, 6);
      
       mylinklist.print();
       mylinklist.sua(6,7);
       mylinklist.print();


    }
    
}
