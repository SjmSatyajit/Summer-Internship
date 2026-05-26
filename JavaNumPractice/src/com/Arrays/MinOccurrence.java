package com.Arrays;

import java.util.Scanner;

public class MinOccurrence {

    public static void printMinOccurrence(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int minElement = arr[0];
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                minElement = arr[i];
            }
        }
        System.out.println("Output-{" + minElement + "-" + minCount + "}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printMinOccurrence(arr);
        sc.close();
    }
}