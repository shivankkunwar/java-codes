package com.shivank;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr =new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[2]=99;
     }
}
