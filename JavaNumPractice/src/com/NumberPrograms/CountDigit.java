package com.NumberPrograms;

import java.util.Scanner;
public class CountDigit {

    static int CheckDigit(int num){

        int count = 0;
        while(num!=0){
            count++;
            num /=10;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(n+" has "+CountDigit.CheckDigit(n)+" no. of digits.");
    }
}
