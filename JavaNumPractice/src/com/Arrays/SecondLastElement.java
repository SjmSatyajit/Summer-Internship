package com.Arrays;

import java.util.Scanner;

public class SecondLastElement {

    public static void SecondLast(int[] arr) {

        if (arr.length < 2) {

            System.out.println("Array must have at least 2 elements.");
        } else {

            System.out.println("The 2nd last element is: " + arr[arr.length - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SecondLast(arr);

        sc.close();
    }
}
