package com.NumberPrograms;

import java.util.Scanner;
public class EvenOdd {

    static int CheckNum(int num){
        if(num%2 == 0) {
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(EvenOdd.CheckNum(n)==1){
            System.out.println(n+" is an Even Number.");
        }else{
            System.out.print(n+" is an Odd Number.");
        }
    }
}
