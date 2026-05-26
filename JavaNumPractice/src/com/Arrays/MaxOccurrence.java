package com.Arrays;

import java.util.Scanner;

public class MaxOccurrence {

    public static void MaxOccurrence(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int maxElement = arr[0];
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Output-{" + maxElement + "-" + maxCount + "}");
    }

    // Main Method: Handles terminal inputs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxOccurrence(arr);

        sc.close();
    }
}