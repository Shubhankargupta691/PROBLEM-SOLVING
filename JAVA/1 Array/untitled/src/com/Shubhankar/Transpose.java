package com.Shubhankar;

import java.util.*;
public class Transpose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];


        System.out.println("enter the data of matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        transpose(row, col, arr);

    }

    static void transpose(int row, int col, int[][] arr) {
        int[][] trans = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("the transpose of a given matrix is:");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(trans[i]));
        }
        System.out.println();
    }
}