package com.shivank;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2] = 23;
        arr[3]= 344;
        arr[4]= 232;
        System.out.println(arr[3]);
    //input using forloops
//        for(int i=0;i<arr.length;i++){
//            arr[i]= in.nextInt();
//        }
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i] +" ");
////        }
//        for (int sum : arr){
//            System.out.print(sum + " ");
//        }
        System.out.println("string");
        String[] name = new String[5];
        for(int i=0 ; i<name.length;i++){
            name[i]= in.next();
        }
        System.out.println(Arrays.toString(name));
    }
}
