package com.Khaitq20041110035.tuan5;
import java.util.Objects;

public class sanpham  implements Comparable<sanpham>{
     String tensanpham;
         Double dongia;
         Double giamgia;
         Double thuenhapkhau;

        public sanpham(String tensanpham) {
            this.tensanpham = tensanpham;
        }
    
        public sanpham(String tensanpham, Double dongia, Double giamgia, Double thuenhapkhau) {
            this.tensanpham = tensanpham;
            this.dongia = dongia;
            this.giamgia = giamgia;
            this.thuenhapkhau = thuenhapkhau;
        }
    
        public String gettensanpham() {
            return tensanpham;
        }
    
        public void settensanpham(String tensanpham) {
            this.tensanpham = tensanpham;
        }
    
        public Double getdongia() {
            return dongia;
        }
    
        public void setdongia(Double dongia) {
            this.dongia = dongia;
        }
    
        public Double getgiamgia() {
            return giamgia;
        }
    
        public void setgiamgia(Double giamgia) {
            this.giamgia = giamgia;
        }
    
        public Double getthuenhapkhau() {
            return thuenhapkhau;
        }
    
        public void setthuenhapkhau(Double thuenhapkhau) {
            this.thuenhapkhau = thuenhapkhau;
        }
    
        
        
        @Override
        public String toString() {
            return "sản phẩm [tên sản phẩm = " + tensanpham + ", đồng giá = " + dongia + ", giảm giá = " + giamgia
                    + ", thuế nhập khẩu " + thuenhapkhau + "]";
        }
    
        @Override
        public int compareTo(sanpham o) {
            return this.tensanpham.compareTo(o.tensanpham);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(tensanpham, dongia, giamgia, thuenhapkhau);
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
           sanpham other = (sanpham) obj;
            return Objects.equals(tensanpham, other.tensanpham);
        }
        
    
}
