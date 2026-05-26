package com.Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void printDistinct(int[] arr) {
        int n = arr.length;
        System.out.print("Output-{");
        boolean first = true;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Check if this element already appeared before index 'i'
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                if (!first) System.out.print(",");
                System.out.print(arr[i]);
                first = false;
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printDistinct(arr);
        sc.close();
    }
}