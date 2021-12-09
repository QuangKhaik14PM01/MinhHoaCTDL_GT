package com.Khaitq20041110035.tuan9;

import java.util.Arrays;

public class tuyentinh {
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,8};
        int x=10;
        int result =search(arr, x);
        if(result == -1)
        System.out.println("in");
        else
        System.out.println("in ra" + result);
    }
        
    public static int search(int arr[],int x){
        int n = arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
}
