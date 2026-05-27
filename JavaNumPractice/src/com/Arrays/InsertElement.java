package com.Arrays.FromQ27;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

    // Method containing the core logic
    public static int[] insertAtIndex(int[] arr, int targetIndex, int newElement) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < targetIndex) {
                result[i] = arr[i];
            } else if (i == targetIndex) {
                result[i] = newElement;
            } else {
                result[i] = arr[i - 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter target index: ");
        int index = sc.nextInt();

        if (index < 0 || index > arr.length) {
            System.out.println("Invalid Index!");
        } else {
            int[] output = insertAtIndex(arr, index, element);
            System.out.println("Output: " + Arrays.toString(output));
        }
        sc.close();
    }
}
