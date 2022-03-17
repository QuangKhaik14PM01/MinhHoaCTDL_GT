package thigiuaky;

public class DanhSachGiaoDich {
    
    GiaoDich gd[] =new GiaoDich[1000];
    private int countGD, tong1=0,tong2=0,dem=0, tongtien=0;

    public DanhSachGiaoDich(){
         countGD=0;
         for(int a =0;a<countGD;a++)
         gd[a] =new GiaoDich();

    }

    public void themGD(int temp){
        if(countGD>1000)
        System.err.println("không đủ chỗ để tính ");
        else{
            if(temp==1){ 
                gd[countGD]=new GiaoDichDat();
                GiaoDichDat gdd = new GiaoDichDat();
                gdd.nhaploaidat();
                gdd.thanhtien();
                gd[countGD]=gdd;
                tong1+=gdd.dientich;
            }else{
                   gd[countGD]=new GiaoDichNha();
                   GiaoDichNha gdn = new GiaoDichNha();
                   gdn.nhaploainha();
                   gdn.thanhtien();
                   gd[countGD]=gdn;
                   gd[countGD]=gdn;
                   tong2+=gdn.dientich;
                   dem++;
            } 
            countGD++;
            
        }
            
        }
        public void hienthidanhsach(){
            for(int a=0;a<countGD;a++){
                System.out.println("hiển thị " + (a+1));
                System.out.println(gd[a].toString());
            }
        }
          public void tongsl(){
              System.out.println("tổng số lượng cho giao dịch đất " +tong1);
              System.out.println("tổng số lượng cho giao dịch nhà " +tong2);


          }

          public void Trungbinhgiaodichdat(){
              System.out.println("trung bình của giao dịch đất " + (tongtien/dem) );
          }
    }


