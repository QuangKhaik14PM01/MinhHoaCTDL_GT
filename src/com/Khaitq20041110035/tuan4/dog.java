package com.Khaitq20041110035.tuan4;

public class dog {
    int size;
    String color;
    String name;

    public dog(){}
    public dog(int s){
        size = s;
    }

    public dog(int s, String c, String n){
        size = s;
        color = c;
        name = n;
    }

    void inthongtin(){
        System.out.println("size = " + size + "" + "color = " + color + "name = " + name ) ;
    }
    
    
}
