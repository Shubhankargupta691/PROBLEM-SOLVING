package com.Shubhankar;

public class Max {
    public static void main(String[] args) {
        int [] arr ={1,56,12,74,32};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

    static int maxRange(int [] arr , int start , int end){
        int maxVal = arr[0];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int max(int [] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
