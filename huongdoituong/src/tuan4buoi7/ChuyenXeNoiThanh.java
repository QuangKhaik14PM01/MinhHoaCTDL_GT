package tuan4buoi7;

import java.util.Scanner;

public class ChuyenXeNoiThanh  extends ChuyenXe  {
    private String soTuyen;
    private double soKmDiDuoc;
     
    public ChuyenXeNoiThanh() {
        super();
    }
 
    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
 
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public Scanner getScanner() {
        return scanner;
    }
 
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();   // gọi hàm nhapThongTinChuyenXe() của lớp ChuyenXe
        System.out.print("Nhap so tuyen: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhap so km đi đuoc: ");
        soKmDiDuoc = scanner.nextDouble();
    }
     
    public String toString() {
        return super.toString() + ", so tuyen: " + this.soTuyen + 
                ", so km đi đuoc: " + this.soKmDiDuoc;
    }
}
    

