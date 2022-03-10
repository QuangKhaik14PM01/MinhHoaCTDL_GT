package tuan4buoi7;
import java.util.ArrayList;
import java.util.Scanner;
 
public class ChuyenXeTesTDrive {
    public static void main(String[] args) {
        ArrayList<ChuyenXeNoiThanh> arrChuyenXeNoiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNgoaiThanh> arrChuyenXeNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so chuyen xe noi thanh: ");
        soChuyenNoiThanh = scanner.nextInt();
        System.out.print("Nhap so chuyen xe ngoai thanh: ");
        soChuyenNgoaiThanh = scanner.nextInt();
         
        System.out.println("Nhap thong tin chuyen xe noi thanh:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ":");
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhapThongTinChuyenXe();
            doanhThuXeNoiThanh += chuyenXeNoiThanh.getDoanhThu();
            arrChuyenXeNoiThanh.add(chuyenXeNoiThanh);
        }
         
        System.out.println("Nhap thong tin chuyen xe ngoai thanh:");
        for (int i = 0; i < soChuyenNgoaiThanh; i++) {
            System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ":");
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhapThongTinChuyenXe();
            doanhThuXeNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
            arrChuyenXeNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
         
        System.out.println("-----Thong tin chuyen xe noi thanh-----");
        for (int i = 0; i < arrChuyenXeNoiThanh.size(); i++) {
            System.out.println(arrChuyenXeNoiThanh.get(i).toString());
        }
         
        System.out.println("-----Thong tin chuyen xe ngoai thanh-----");
        for (int i = 0; i < arrChuyenXeNgoaiThanh.size(); i++) {
            System.out.println(arrChuyenXeNgoaiThanh.get(i).toString());
        }
         
        System.out.println("Doanh thu tung chuyen xe: ");
        System.out.println("Doanh thu chuyen xe noi thanh: " + doanhThuXeNoiThanh);
        System.out.println("Doanh thu chuyen xe ngoai thanh: " + doanhThuXeNgoaiThanh);
    }
 
}

