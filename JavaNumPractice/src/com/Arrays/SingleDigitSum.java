package com.Arrays;

import java.util.Scanner;

public class SingleDigitSum {

    public static void SingleDigit(int[] arr) {
        System.out.print("Output-{");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // Core logic to get single-digit sum using math shortcut (digital root)
            if (num == 0) {
                System.out.print(0);
            } else {
                int singleDigit = num % 9;
                System.out.print(singleDigit == 0 ? 9 : singleDigit);
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
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        SingleDigit(arr);
        sc.close();
    }
}