package com.Arrays;

import java.util.Scanner;

public class NoOfZero {

    public int zeros(int[] arr){

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        NoOfZero zr = new NoOfZero();
        if(zr.zeros(arr)<=0){
            System.out.println("No Zeros are present in the array.");
        }else{
            System.out.println("The number of zeros are present in this array are : "+ zr.zeros(arr));
        }
    }
}
