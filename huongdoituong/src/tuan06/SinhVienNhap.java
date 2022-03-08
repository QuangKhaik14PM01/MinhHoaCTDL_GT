package tuan06;
import java.util.Scanner;
 
public class SinhVienNhap {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;
 
    //khởi tạo constructor mặc định
    public SinhVienNhap() {
 
    }
    //khởi tạo constructor có tham số
    public SinhVienNhap(int maSV, String hoten, String diaChi, String sTD) {
        this.maSV = maSV;
        this.hoTen = hoten;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }
    //--------------begin getter and setter--------------------
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
 
    public String getsTD() {
        return sTD;
    }
 
    public void setsTD(String sTD) {
        this.sTD = sTD;
    }
    //--------------end getter and setter--------------------
    ///khởi tạo phương thức toString
    @Override
    public String toString() {
        return "SinhVienNhap{" +
                "maSV=" + maSV +
                ", hoten='" + hoTen +  
                ", diaChi='" + diaChi +  
                ", sTD='" + sTD +  +
                '}';
    }
    //khởi tạo phương thức hiển thị theo format
    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", maSV, hoTen, diaChi, sTD);
    }
}