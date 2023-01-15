package com.Shubhankar;
    import java.util.Arrays;
    import java.util.Scanner;
public class Foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Rows and columns");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] arr = new int[row][col];
        System.out.println("Enter your element");
        for ( row = 0; row < arr.length; row++) {
            for ( col = 0; col < arr[row].length; col++) {
                    arr[row][col]= sc.nextInt();
            }
        }
        for(int[] j : arr){
            System.out.println(Arrays.toString(j));
        }


    }
}
