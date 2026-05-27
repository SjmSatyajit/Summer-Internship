package com.Arrays.FromQ27;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftZerosRight {

    // Method containing the core logic
    public static int[] shiftZerosRight(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements containing zeros: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] output = shiftZerosRight(arr);
        System.out.println("Output: " + Arrays.toString(output));
        sc.close();
    }
}
