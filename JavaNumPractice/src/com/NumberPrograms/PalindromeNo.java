package com.NumberPrograms;

import java.util.Scanner;
public class PalindromeNo {

    public boolean isPalindrome(int num){

        int sum = 0;
        int x = num;

        if (num>0){
            while(num!=0){
                int rem = num%10;
                sum = sum*10 +rem;
                num /= 10;
            }
        }
        return x == sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        PalindromeNo pl = new PalindromeNo();
        if(pl.isPalindrome(n)){
            System.out.println(n+" is a Palindrome number.");
        }else{
            System.out.println(n+" is not a Palindrome number.");
        }
    }
}
