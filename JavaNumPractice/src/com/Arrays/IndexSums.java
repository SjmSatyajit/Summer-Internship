package com.Arrays;

import java.util.Scanner;

public class IndexSums {

    public static void calculateAndPrintIndexSums(int[] arr) {

        int evenIndexSum = 0;
        int oddIndexSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum += arr[i];
            } else {
                oddIndexSum += arr[i];
            }
        }
        System.out.println("Sum of even index Values : " + evenIndexSum +"\nSum of even index values : " +  oddIndexSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        calculateAndPrintIndexSums(arr);

        sc.close();
    }
}
