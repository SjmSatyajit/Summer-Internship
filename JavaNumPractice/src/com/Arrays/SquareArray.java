package com.Arrays;

import java.util.Scanner;

public class SquareArray {

    public static void printSquares(int[] arr) {
        System.out.print("Output-{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        printSquares(arr);
        sc.close();
    }
}