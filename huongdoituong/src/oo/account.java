package oo;

import java.util.Scanner;

public class account {
    //data
    int accountnumber = 12345;
    int accountbanlance = 0;
Scanner input = new Scanner(System.in);

    //function
     void withraw(){
        System.out.println("nhap vao so tien can rut ");
       
       int  withrawamount = input.nextInt();
        accountbanlance -= withrawamount;// thao tác lên data
       }
        void deposit(){
        System.out.println("nhap vao so tien can gui ");
        int depositamount = 0;
        depositamount = input.nextInt();
        accountbanlance += depositamount;// thao tác lên data
    
       }
      void show(){
            System.out.println("thong tin tai khoan ");
            System.out.println("account number " +  accountnumber);
            System.out.println("account banlance " + accountbanlance);
        }
    
}
