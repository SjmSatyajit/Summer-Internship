package com.diffNum;

import java.util.Scanner;
public class PrimeNo {

    public int isPrime(int num){

        int count = 0;
        int i = 1;
        while(i<=num/2){

            if(num%i == 0){
                count++;
            }
            i++;
        }
        if(count == 1){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        PrimeNo pm = new PrimeNo();
        if(pm.isPrime(a)==1){
            System.out.println(a+" is a Prime Number.");
        }else{
            System.out.println(a+" is not a Prime Number.");
        }
    }
}
