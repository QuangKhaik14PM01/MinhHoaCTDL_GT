package com.Khaitq20041110035.tuan9;

public class sapxep {
    public static void main(String[] args) {
     int[] arr= {5,1,12,-5,-7,8};
     selectionSort(arr);   
        
    }
    public static void selectionSort(int[] arr) {
        for(int i =0; i<arr.length-1;i++)
        {
            int index =i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] <arr[index]){
                    index = j;//searching for lowest index
                }
            }
          int smallernuber =arr[index];
          arr[index]= arr[i];
          arr[i] = smallernuber;
        }
        System.out.println("sắp xếp theo thứ tự");
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
