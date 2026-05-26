package com.Arrays;

import java.util.Scanner;

public class SwapZeroAndMinusOne {

    public static void convertValues(int[] arr) {
        System.out.print("Output-{");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print("-1");
            } else if (arr[i] == -1) {
                System.out.print("0");
            } else {
                System.out.print(arr[i]);
            }
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        convertValues(arr);
        sc.close();
    }
}