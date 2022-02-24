package tuan3;

public class Choo {
    int size;
    String breed;
    String name;

    void bark(){
        if(size>14){
            System.out.println("ruff!");
        }else{
            System.out.println("yip");
        }
   
    }
    void setbigger(){
        size+=5;
    }
    void run(){
        System.out.println("running ");
        this.bark();
    }
}
