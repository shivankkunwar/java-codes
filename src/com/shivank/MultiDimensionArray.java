package com.shivank;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
       int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
//        int [][] arr = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= in.nextInt();
            }
        }
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" "
//                );
//
//            }
//            System.out.println();
//        }

//        for(int i= 0 ;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
            for(int [] a: arr){
                System.out.println(Arrays.toString(a));
            }
    }
}
