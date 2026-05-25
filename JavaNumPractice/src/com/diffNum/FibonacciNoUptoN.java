package com.diffNum;

import java.util.Scanner;
public class FibonacciNoUptoN {

    public void isFibonacci(int n){
        if(n==0){
            System.out.println("Please enter a number greater than zero.");
            return;
        }
        if(n==1){
            System.out.println(0);
            return;
        }

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2+" ");

        for(int i=3; i<=n;i++){

            int n3 = n1+n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. upto which Fibonacci series required : ");
        int f = sc.nextInt();

        FibonacciNoUptoN fn = new FibonacciNoUptoN();
        fn.isFibonacci(f);
    }
}
