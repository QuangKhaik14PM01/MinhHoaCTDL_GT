package thigiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    protected String magiaodich;
    protected Date ngaygiaodich;
    protected int dientich;
    protected double dongia;



    Scanner nhap = new Scanner(System.in);
    public GiaoDich(){
        super();
        this.magiaodich="";
         
        this.ngaygiaodich=null;
        this.dientich=0;
        this.dongia=0;
    }

    public GiaoDich(String magiaodich, Date ngaygiaodich, int dientich, double dongia){
        this.magiaodich=magiaodich;
        
        this.ngaygiaodich=ngaygiaodich;
        this.dientich=dientich;
        this.dongia=dongia;
    }

   

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

   

    public Date getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(Date ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }
    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public Scanner getNhap() {
        return nhap;
    }

    public void nhapthongtindat() throws ParseException {
        SimpleDateFormat vietnam = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("mã giao dịch ");
        magiaodich=nhap.nextLine();
       
        System.out.println("ngày giao dịch ");
        ngaygiaodich=vietnam.parse(nhap.nextLine());
        System.out.println("diện tích ");
        dientich=nhap.nextInt();
        System.out.println("đơn giá ");
        dongia=nhap.nextDouble();
        nhap.nextLine();
    }

    public String toString(){
        SimpleDateFormat vietnam = new SimpleDateFormat("dd/MM/yyyy");
        return "mã giao dịch " + this.magiaodich  + "ngày giao dịch " + vietnam.format(ngaygiaodich) + "diện tích " + this.dientich + "đơn giá " +this.dongia;
    }
}
