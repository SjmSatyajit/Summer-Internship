package com.Arrays.FromQ27;

import java.util.Arrays;
import java.util.Scanner;
public class RevArrElements {

    public static int[] revArr(int[] arr){


        int[] x = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            while (arr[i] != 0) {
                int rem = arr[i] % 10;
                sum = sum * 10 + rem;
                arr[i] = arr[i]/10;
            }
            x[i] = sum;
        }

        return x;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The reverse of the each array elements are : { "+ Arrays.toString(revArr(arr)) +" }");
    }
}
