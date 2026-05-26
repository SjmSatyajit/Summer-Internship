package com.Arrays;

import java.util.Scanner;

public class Vowels {

    public static void vowels(char[] arr){

        System.out.println("The vowels of the given array are : ");

        for(int i=0; i<arr.length; i++){

            char ch = arr[i];
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){

                System.out.print(ch+" ");
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        char[] arr = new char[n];

        System.out.println("Enter " + n + " alphabetic elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        vowels(arr);

    }
}
