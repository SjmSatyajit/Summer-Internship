package com.Arrays;

import java.util.Scanner;
public class ReverseArray {

    public static void printReverse(char[] arr){

        for (int i = arr.length - 1; i >= 0; i--){

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string/word to convert to a character array: ");
        String input = sc.next();
        char[] charArray = input.toCharArray();

        System.out.println("Reverse order: ");
        printReverse(charArray);

        sc.close();
    }
}
