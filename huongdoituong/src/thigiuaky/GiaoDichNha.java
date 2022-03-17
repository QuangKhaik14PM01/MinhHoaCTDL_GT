package thigiuaky;

import java.util.Date;

public class GiaoDichNha  extends GiaoDich{
    private String loainha;
    private double thanhtien;

    public GiaoDichNha(){
        super();
        this.loainha="";

    }

    public GiaoDichNha(String magiaodich, Date ngaygiaodich, int dientich,double dongia, String loainha, double thanhtien){
        super(magiaodich, ngaygiaodich, dientich, dongia);
        this.loainha=loainha;
        this.thanhtien=thanhtien;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    public void nhaploainha(){
        System.out.println("loại nhà ");
        loainha=nhap.nextLine();
    }

    public double thanhtien(){
        if(loainha=="nhà cao cấp"){
            return this.thanhtien=this.dongia*this.dientich;

        }if(loainha=="nhà thường"){
            return this.thanhtien=90%this.dongia*this.dientich;
        }else{
            System.out.println("không tính");
            return thanhtien=0;
        }
    }
    
    public String toString(){
        return "Giao dịch nhà" + super.toString() + "loại nhà " +this.loainha + "thành tiền " +this.thanhtien;
    }
}
