package com.diffNum;

import java.util.Scanner;
public class GCD {

    public static int findGCD(int a, int b){

        while (b != 0) {

            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int y = sc.nextInt();

        System.out.println("The GCD of "+x+" & "+y+" is : "+findGCD(x, y)+".");
    }
}
