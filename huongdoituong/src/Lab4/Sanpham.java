package Lab4;

import java.util.Scanner;

public class Sanpham {
    String tensp;
    double dongia;
    double giamgia;
    
    String gettensp(){
        return tensp;
    }
    void settensp(String tensp){
        this.tensp =tensp;
          }
          double getdongia(){
              return dongia;
          }
          void setdongia(double dongia){
              this.dongia=dongia;
          }
          double getgiamgia(){
              return giamgia;
          }
          void setgiamgia(double giamgia){
              this.giamgia=giamgia;
          }
          
          Sanpham(String tensp, double dongia){
              this.tensp=tensp;
              this.dongia=dongia;
              this.giamgia=0;
          }
          Sanpham(){}
          Sanpham(String tensp, double dongia, double giamgia){
            this.tensp =tensp;
            this.dongia=dongia;
            this.giamgia=giamgia;

          }
   
    
    
    double getthuenhapkhau(){
        return dongia * 0.1;
    }
    void xuat(){
        System.out.println("Ten san pham " + tensp);
        System.out.println("Don gia " + dongia);
        System.out.println("Giam gia " + giamgia);
        System.out.println("Thue nhap khau " + getthuenhapkhau());
    }
       void nhap(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap ten san pham ");
           tensp = scanner.nextLine();
          
           System.out.println("Nhap don gia ");
           dongia = scanner.nextDouble();
          
           System.out.println("Nhap ten giam gia ");
           giamgia = scanner.nextDouble();

       }
    
}
