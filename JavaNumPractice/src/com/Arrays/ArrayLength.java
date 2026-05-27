package com.Arrays.FromQ27;

import java.util.Scanner;

public class ArrayLength {

    // Method containing the core logic
    public static int getLength(int[] arr) {
        int count = 0;
        for (int num : arr) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to input? :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int calculatedLength = getLength(arr);
        System.out.println("Length of the array is: " + calculatedLength);
        sc.close();
    }
}
