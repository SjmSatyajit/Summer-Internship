package com.Arrays.FromQ27;


import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

    public static int[] deleteFromIndex(int[] arr, int targetIndex) {
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == targetIndex) {
                continue;
            }
            result[index++] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index!");
        } else {
            int[] output = deleteFromIndex(arr, index);
            System.out.println("Output: " + Arrays.toString(output));
        }
        sc.close();
    }
}
