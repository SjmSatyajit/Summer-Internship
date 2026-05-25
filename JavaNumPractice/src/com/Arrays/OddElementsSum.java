package com.Arrays;

import java.util.Scanner;

public class OddElementsSum {

    public static int OddSum(int[] arr) {

        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
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

        int oddSum = OddSum(arr);
        System.out.println("Odd elements sum: " + oddSum);

        sc.close();
    }
}
