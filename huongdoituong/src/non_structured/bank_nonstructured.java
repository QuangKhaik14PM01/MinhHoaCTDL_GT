package non_structured;

import java.util.Scanner;

public class bank_nonstructured {
    public static void main(String[] args) {
        // data:
        // khai báo 2 biến
        int accountnumber = 12345;
        int accountbanlance = 0;


        //data employ


        //data custemer


        // hành động thao tác lên data
        Scanner input;
        input = new Scanner(System.in);


        // gửi tiền
        System.out.println("nhap vao so tien can gui ");
        int depositamount = 0;
        depositamount = input.nextInt();
        accountbanlance += depositamount;// thao tác lên data

        //show
        System.out.println("thong tin tai khoan ");
        System.out.println("account number " +  accountnumber);
        System.out.println("account banlance " + accountbanlance);

        //rút tiền
        System.out.println("nhap vao so tien can rút ");
        int withrawamount = 0;
        withrawamount = input.nextInt();
        accountbanlance -= withrawamount;// thao tác lên data
       // accountbanlance = accountbanlance-withrawamount;
       //show
       System.out.println("thong tin tai khoan ");
        System.out.println("account number " +  accountnumber);
        System.out.println("account banlance " + accountbanlance);


        //rút tiền
        System.out.println("nhap vao so tien can rút ");
        withrawamount = input.nextInt();
        accountbanlance -= withrawamount;// thao tác lên data
       // accountbanlance = accountbanlance-withrawamount;
       //show
       System.out.println("thong tin tai khoan ");
        System.out.println("account number " +  accountnumber);
        System.out.println("account banlance " + accountbanlance);


        //rút tiền
        System.out.println("nhap vao so tien can rút ");
        withrawamount = input.nextInt();
        accountbanlance -= withrawamount;// thao tác lên data
       // accountbanlance = accountbanlance-withrawamount;
       //show
       System.out.println("thong tin tai khoan ");
        System.out.println("account number " +  accountnumber);
        System.out.println("account banlance " + accountbanlance);


        //thao tác lên data của employ


        //hành động lên custumer




    }
    
}
