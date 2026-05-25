package com.diffNum;
import java.util.Scanner;
public class PrimeNoUptoN {

    public void isPrime(int num){

        System.out.println("Prime Numbers from 01 to "+num+" are : ");
        for(int i=1; i<=num; i++){
            int count = 0;
            if (i <= 1) {
                continue;
            }
            for(int j=1; j<=i/2; j++){

                if(i%j == 0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which Prime no. requires : ");
        int p = sc.nextInt();

        PrimeNoUptoN pm = new PrimeNoUptoN();
        pm.isPrime(p);
    }
}
