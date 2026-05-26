package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertEven {

    public static void evenArray(int[] arr, Scanner sc) {
        System.out.println("Enter " + arr.length + " even values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            int value = sc.nextInt();

            if (value % 2 == 0) {
                arr[i] = value;
            } else {
                System.out.println("That's not an even number! Try again.");
                i--; // Repeat current index
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        evenArray(arr, sc);

        System.out.println("Final Array: " + Arrays.toString(arr));
        sc.close();
    }
}
