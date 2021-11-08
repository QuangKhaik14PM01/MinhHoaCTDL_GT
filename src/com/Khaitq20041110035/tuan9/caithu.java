package com.Khaitq20041110035.tuan9;

import java.util.Arrays;

public class caithu {
    static void bubblesort(int[] arr){
         int n = arr.length;
         int temp = 0;
         for(int i= 0;i<n;i++){
             for(int j=1;j<(n-i);j++){
                 if(arr[j-1] > arr[j]){
                     //swap elements
                     temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] =temp;
                 }
             }
         }
    }
    public static void main(String[] args) {
        int[] xep = new int[]{3,4,2,5,8};
        System.out.println("danh sách ban đầu" + Arrays.toString(xep));

        bubblesort(xep);
        System.out.println("danh sách xếp" + Arrays.toString(xep));

    }
    
    
}
