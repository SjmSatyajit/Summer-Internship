package com.Arrays.FromQ27;


import java.util.Arrays;
import java.util.Scanner;

public class ShiftZerosLeft {

    // Method containing the core logic
    public static int[] shiftZerosLeft(int[] arr) {
        int[] result = new int[arr.length];
        int index = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                result[index--] = arr[i];
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
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] output = shiftZerosLeft(arr);
        System.out.println("Output: " + Arrays.toString(output));
        sc.close();
    }
}
