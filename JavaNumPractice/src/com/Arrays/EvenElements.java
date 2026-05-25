package com.Arrays;

import java.util.Scanner;
public class EvenElements {

    public static void printEvenElements(int[] arr) {
        for (int num : arr) {

            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = Sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        System.out.println("Even elements: ");
        printEvenElements(arr);

        Sc.close();
    }
}
