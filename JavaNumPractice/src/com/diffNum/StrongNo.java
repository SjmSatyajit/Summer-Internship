package com.diffNum;

import java.util.Scanner;
public class StrongNo {

    static int isStrong(int num){

        int x = num;
        int fact = 1;
        int sum = 0;
        while(num!=0){

            int rem = num%10;
            for(int i=rem; i>=1; i--){
                fact *= i;
            }
            sum += fact;
            num /= 10;
            fact = 1;
        }

        if(x==sum){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        if(isStrong(a)==1){
            System.out.println(a+" is a Strong Number.");
        }else{
            System.out.println(a+" is not a Strong Number.");
        }
    }
}
