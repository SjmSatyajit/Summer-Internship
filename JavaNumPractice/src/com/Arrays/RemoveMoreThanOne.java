package com.Arrays;

import java.util.Scanner;

public class RemoveMoreThanOne {

    public static void Unique(int[] arr) {
        System.out.print("Output-{");
        boolean first = true;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                if (!first) System.out.print(",");
                System.out.print(arr[i]);
                first = false;
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Unique(arr);
        sc.close();
    }
}