package com.Arrays;

import java.util.Scanner;

public class CountOccurrence {

    public static void printOccurrences(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        System.out.print("Output-{");
        boolean firstPrint = true;

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

            if (!firstPrint) {
                System.out.print(", ");
            }
            System.out.print(arr[i] + "-" + count);
            firstPrint = false;
        }
        System.out.println("}");
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

        printOccurrences(arr);

        sc.close();
    }
}