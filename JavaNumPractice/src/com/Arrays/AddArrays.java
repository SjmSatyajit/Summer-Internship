package com.Arrays.FromQ27;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrays {


    public static int[] addArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = val1 + val2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements for 1st array: ");
        for(int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.print("Enter size of 2nd array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for 2nd array: ");
        for(int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        int[] output = addArrays(arr1, arr2);
        System.out.println("Output: " + Arrays.toString(output));
        sc.close();
    }
}

