package tuan4buoi7;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
     
    public ChuyenXeNgoaiThanh() {
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0;
    }
 
    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
 
    public String getNoiDen() {
        return noiDen;
    }
 
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
 
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
 
    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
     
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();
        System.out.print("Nhap noi đen: ");
        noiDen = scanner.nextLine();
        System.out.print("Nhap so ngay đi đuoc: ");
        soNgayDiDuoc = scanner.nextInt();
    }
    public String toString() {
        return super.toString() + ", noi đen: " + this.noiDen + ", so ngay đi đuoc: " + 
                this.soNgayDiDuoc;
    }
}