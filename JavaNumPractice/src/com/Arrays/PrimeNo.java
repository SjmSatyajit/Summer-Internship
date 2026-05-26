package com.Arrays;

import java.util.Scanner;

public class PrimeNo {

    public static void isPrime(int[] arr){


        System.out.println("The prime no. of this array are : ");
        for(int i=1; i<arr.length; i++){
            int count = 0;

            for(int j=1; j<=arr[i]/2;j++){
                if(arr[i]%j == 0) {
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of elements of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        PrimeNo.isPrime(arr);

        sc.close();
    }
}
