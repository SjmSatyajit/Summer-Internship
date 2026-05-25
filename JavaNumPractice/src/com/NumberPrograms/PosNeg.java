package com.NumberPrograms;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;
public class PosNeg {

    static String CheckNum(int num){

        if(num == 0){
            return "This number is Zero.";
        } else if (num<0) {
            return "This is a negative number.";
        }else{
            return "This is a positive number.";
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(PosNeg.CheckNum(n));
    }
}
