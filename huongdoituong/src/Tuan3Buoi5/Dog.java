package Tuan3Buoi5;

public class Dog {
    private int size;// implementation
    //**defaut-mặc định */ 
     String name; //interface
    /** defaut */ private String breed;//interface


    //methods
    //interface
    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        if(size>0){
            this.size=size;
        }else{
            System.out.println("khong hop le ");
        }
    }
}
