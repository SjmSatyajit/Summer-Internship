package com.Arrays.FromQ27;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

    // Method containing the core logic
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter 1st array elements: ");
        for(int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.print("Enter size of 2nd array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter 2nd array elements: ");
        for(int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        int[] output = mergeArrays(arr1, arr2);
        System.out.println("Merged Output: " + Arrays.toString(output));
        sc.close();
    }
}
