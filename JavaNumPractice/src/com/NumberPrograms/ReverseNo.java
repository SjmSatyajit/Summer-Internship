package com.NumberPrograms;

import java.util.Scanner;
public class ReverseNo {

    static int revNo(int num){

        int revNo = 0;
        while(num!=0){

            int x = num % 10;
            revNo = (revNo*10) + x;
            num /= 10;
        }
        return revNo;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        System.out.println("The reverse of "+n+" is : "+ReverseNo.revNo(n));

    }
}
