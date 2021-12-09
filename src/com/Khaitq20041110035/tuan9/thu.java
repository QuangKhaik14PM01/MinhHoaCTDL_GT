package com.Khaitq20041110035.tuan9;

import java.util.Arrays;

public class thu {
    public static void main(String[] args) {
        int[] xep1 = new int[]{3,4,2,5,8};
        System.out.println("danh sách ban đầu" + Arrays.toString(xep1));

        sort(xep1);
        System.out.println("danh sách xếp" + Arrays.toString(xep1));}
    static void sort(int arr[]){
        int n =arr.length;
        for(int i =1;i<n;i++){
            int key = arr[i];
            int j =i-1;
            // move element of arr[0...i-1], that are greater than key, to one position ahead or their current position
            while(j>=0 && arr[j]>key){
              arr[j+1] = arr[j];
              j=j-1;
            }
            arr[j+1] =key;
        }
    }
    
    }

