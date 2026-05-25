package com.diffNum;

import java.sql.SQLOutput;
import java.util.Scanner;
public class NeonNo {

    static boolean isNeon(int num){

        int sq = num*num;
        int x = sq;
        int sum = 0;
        while(sq!=0){

            int rem = sq % 10;
            sum += rem;
            sq /= 10;
        }
        System.out.println("Number : "+num+", Square of the No. : "+x);
        return sum == num;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(isNeon(n)){
            System.out.println(n+" is a Neon Number.");
        }else{
            System.out.println(n+" is not a Neon Number.");
        }
    }
}
