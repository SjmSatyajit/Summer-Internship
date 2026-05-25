package com.diffNum;

import java.util.Scanner;
public class PerfectNo {

    static boolean isPerfect(int num){

        int sum = 0;
        if(num<=0){
            return false;
        }else{

            for(int i=1; i<= num/2; i++){
                if(num%i == 0){
                    sum += i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Integer : ");
        int a = sc.nextInt();

        if(isPerfect(a)){
            System.out.println(a+" is a Perfect Number.");
        }else {
            System.out.println(a + " is not a Perfect Number.");
        }
    }
}
