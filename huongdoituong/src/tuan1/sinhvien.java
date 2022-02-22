package tuan1;

public class sinhvien {
    boolean gioitinh;
    float tuoi;
    String ten;
    float diemtb;
    String khoa;

 public sinhvien(){
    this.ten ="khải";
    this.tuoi = 20;
    this.gioitinh = false;
    this.khoa ="kĩ thuật phần mềm";
    this.diemtb = 5;
 }
 public sinhvien( boolean gioitinh, float tuoi){
     this.gioitinh=gioitinh;
     this. tuoi=tuoi;
 }
  public sinhvien( boolean gioitinh, float tuoi, String ten, float diemtb, String khoa ){
    this(gioitinh,tuoi);  
    this.ten = ten;
      this.khoa =khoa;
      this.diemtb = diemtb;
  }

    void hoc(){
        System.out.println("hoc ");
    }

    void thi(){
        System.out.println("thi ");
    }

    void dangkymon(){
        System.out.println("dang ky mon ");
    }
    void ra(){
        System.out.println("gioi tinh " +gioitinh);
       
     System.out.println("tuoi " +tuoi);
     System.out.println("ten " +ten);
    
     System.out.println("diem trung binh " +diemtb);
     System.out.println("khoa " +khoa);
    
    }
}
