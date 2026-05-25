package com.diffNum;

import java.util.Scanner;
public class SpyNo {

    public int isSpy(int num){
        int sum = 0;
        int mul = 1;
        int x = num;

        while(num!=0){
            int rem = num%10;
            sum += rem;
            num /= 10;
        }

        while(x!=0){
            int rem1 = x%10;
            mul *= rem1;
            x /= 10;
        }

        if(sum == mul){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        SpyNo sp = new SpyNo();
        if(sp.isSpy(n)==1){
            System.out.println(n+" is a Spy Number.");
        }else{
            System.out.println(n+" is not a Spy Number.");
        }
    }
}
