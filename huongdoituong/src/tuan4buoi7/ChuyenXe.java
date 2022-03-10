package tuan4buoi7;

import java.util.Scanner;
 
public class ChuyenXe {
    protected String maSoChuyen, hoTenTaiXe, soXe;
    protected double doanhThu;
    Scanner scanner = new Scanner(System.in);
     
    public ChuyenXe() {
        super();
        this.maSoChuyen = "";
        this.hoTenTaiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }
 
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super();
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
 
    public String getMaSoChuyen() {
        return maSoChuyen;
    }
 
    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
 
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
 
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
 
    public String getSoXe() {
        return soXe;
    }
 
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
 
    public double getDoanhThu() {
        return doanhThu;
    }
 
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
     
    public void nhapThongTinChuyenXe() {
        System.out.print("Nhap ma so chuyen: ");
        maSoChuyen = scanner.nextLine();
        System.out.print("Nhap ho ten tai xe: ");
        hoTenTaiXe = scanner.nextLine();
        System.out.print("Nhap so xe: ");
        soXe = scanner.nextLine();
        System.out.print("Nhap doanh thu: ");
        doanhThu = scanner.nextDouble();
    }
     
    public String toString() {
        return "Ma so chuyen: " + this.maSoChuyen + ", ho ten tai xe: " + this.hoTenTaiXe
                + ", so xe: " + this.soXe + ", doanh thu: " + this.doanhThu;
    }
}