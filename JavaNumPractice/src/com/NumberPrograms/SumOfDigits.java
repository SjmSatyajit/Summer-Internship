package com.NumberPrograms;

import java.util.Scanner;
public class SumOfDigits {

    public int sumNum(int n){

        int sum = 0;
         while (n!=0){

             int x = n%10;
             sum = sum + x;
             n = n/10;
         }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();

        SumOfDigits sm = new SumOfDigits();
        System.out.println("The sum of digits of "+a+" = "+sm.sumNum(a)+".");
    }
}
