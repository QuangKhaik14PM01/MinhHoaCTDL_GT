package com.Khaitq20041110035.tuan5;

public class ctminhhoamang {
    public static void main(String[] args) {
        
        //int[] mangsonguyen = new int[10];// không thay đổi kích thước được sao khi chỉ định
        int[]arr = {3,5,7,9};//n=4
        int newElement = 8;// phần tử cần thêm vào
        //CHIỀU DÀI MẢNG CŨ
        int n = arr.length;
        // TẠO MẢNG MỚI
        int [] newArr = new  int[n+1];
        // ĐỔ DỮ LIỆU CỦA MNAGR CŨ SANG MẢNG MỚI
        for(int i = 0; i<n; i++ ){
            newArr[i] = arr[i];
        }

     System.out.println("in mảng cũ");
     for(int x : arr){
         System.out.println(x);

     }   
     // THÊM PHẦN TỬ MỚI VÀO MẢNG MỚI
     newArr[n] = newElement;
     System.out.println("in mảng mới");
     for(int x : newArr){
         System.out.println(x);
     }
    }
    
}
