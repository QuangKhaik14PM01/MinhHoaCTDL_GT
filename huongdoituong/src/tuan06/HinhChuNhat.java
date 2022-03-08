package tuan06;

public class HinhChuNhat {
   private double chieudai;
   private double chieurong;


   
   public void setchieudai(double chieudai){
       this.chieudai = chieudai;
   }
   public double getchieudai(){
    return chieudai;
}

  
   public void setchieurong(double chieurong){
       this.chieurong =chieurong;
   }
   public double getchieurong(){
    return chieurong;
}
        public double dientich(){
             return this.chieudai*this.chieurong;
         }

         public double chuvi(){
                   return(this.chieudai+this.chieurong)*2;

         }

         public String to_String(){
             String string="chieu dai " + this.chieudai + " chieu rong " +this.chieurong;
             string += "chu vi " + this.chuvi() + "dien tich " + this.dientich();
             return  string;
         }




    
}
