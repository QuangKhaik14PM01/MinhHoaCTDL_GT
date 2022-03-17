package thigiuaky;

import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) {
        DanhSachGiaoDich dsgd = new DanhSachGiaoDich();
        Scanner in =new Scanner(System.in);
        int x;
        do{
            System.out.println("(--------MENU-------------");
            System.out.println("\t\t|0. thoát ứng dụng\t\t\t\t");
            System.out.println("\t\t|1.thêm giao dịch đất\t\t\t\t ");
            System.out.println("\t\t|2.thêm giao dịch nhà\t\t\t\t");
            System.out.println("\t\t|3.hiển thị danh sách\t\t\t\t");
            System.out.println("\t\t|4.xem tổng số lượng các giao dịch\t\t\t\t");
            System.out.println("\t\t|5.xem trung bình của giao dịch đất\t\t\t\t");
              
            x=in.nextInt();
            switch(x){
                case 1:
                dsgd.themGD(1);
                break;
                case 2:
                dsgd.themGD(2);
                break;
                case 3:
                dsgd.hienthidanhsach();
                break;
                case 4:
                dsgd.tongsl();
                break;
                case 5:
                dsgd.Trungbinhgiaodichdat();
            }

        }while(x!=0);
        System.out.println("");
         
    
    }


    
}
