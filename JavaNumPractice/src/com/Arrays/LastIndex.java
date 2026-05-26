package com.Arrays;

import java.util.Scanner;

public class LastIndex {

    public static int findLastIndex(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find its last index: ");
        int target = sc.nextInt();

        int result = findLastIndex(arr, target);

        System.out.println("Output :- " + result);
        sc.close();
    }
}