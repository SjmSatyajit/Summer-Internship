package com.Arrays.FromQ27;


import java.util.Arrays;
import java.util.Scanner;

public class SumEvenDigits {

    // Method containing the core logic
    public static int[] sumEvenDigits(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                num /= 10;
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] output = sumEvenDigits(arr);
        System.out.println("Output: " + Arrays.toString(output));
        sc.close();
    }
}
