package com.diffNum;

import java.util.Scanner;
public class Factorial {

    public int factNum(int num){

        int fact = 1;
        for(int i=num; i>=1; i--){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int f = sc.nextInt();

        Factorial fact = new Factorial();
        System.out.println("Factorial of "+f+" is : "+fact.factNum(f)+".");

    }
}
