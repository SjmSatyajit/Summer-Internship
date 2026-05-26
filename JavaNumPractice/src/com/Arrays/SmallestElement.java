package com.Arrays;

import java.util.Scanner;

public class SmallestElement {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = findMin(arr);
        System.out.println("Output-{" + result + "}");
        sc.close();
    }
}