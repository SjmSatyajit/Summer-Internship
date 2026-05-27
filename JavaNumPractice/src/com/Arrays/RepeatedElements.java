package com.Arrays.FromQ27;

import java.util.Scanner;

public class RepeatedElements {

    // Method containing the core logic
    public static void printDuplicates(int[] arr) {
        System.out.print("Repeated elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements (include repeats): ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printDuplicates(arr);
        sc.close();
    }
}
