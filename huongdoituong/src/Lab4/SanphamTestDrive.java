package Lab4;

public class SanphamTestDrive {
    public static void main(String[] args) {
        Sanpham sanpham1 = new Sanpham("Quần áo",  10000, 4000);
        Sanpham sanpham2 = new Sanpham();
        sanpham1.nhap();
        sanpham2.nhap();
        sanpham1.xuat();
        sanpham2.xuat();
        Sanpham sanpham3 = new Sanpham("giày dép", 70000);
        sanpham1.xuat();
        sanpham2.xuat();
    }
    
}
