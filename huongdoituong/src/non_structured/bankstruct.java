package non_structured;

import java.util.Scanner;
// toàn cục global

public class bankstruct {
    static int accountnumber = 12345;
    static   int accountbanlance = 0;
      static  Scanner input;
      static String nameemploy;
      static double salary;
      static String name;
      static String address;
   public static void main(String[] args) {
       // data:
        // khai báo 2 biến local
        //data employ
       //data custemer
        // hành động thao tác lên data
     
        input = new Scanner(System.in);
        //show
        show();//make function call
        withraw();
        deposit();

 
   }
  static void withraw(){
    System.out.println("nhap vao so tien can rut ");
   
   int  withrawamount = input.nextInt();
    accountbanlance -= withrawamount;// thao tác lên data
   }
   static void deposit(){
    System.out.println("nhap vao so tien can gui ");
    int depositamount = 0;
    depositamount = input.nextInt();
    accountbanlance += depositamount;// thao tác lên data

   }
   static void show(){
        System.out.println("thong tin tai khoan ");
        System.out.println("account number " +  accountnumber);
        System.out.println("account banlance " + accountbanlance);
    }
   static void getname(){
    name = "khai ";//không được đụng vào dữ liệu của custumer  
    nameemploy = "";

    }
    static void getsalary(){
        salary = 500;
    }
    static String getcusname(){// khách hàng custumer
        accountbanlance = 0;// vô tình hay cố ý thao tác lên dữ liệu mà đáng lẽ hàm kh nên được đụng chạm đến cái dữ data đó
        return name + address;
    }
    
}
