package com.diffNum;

import java.util.Scanner;
public class ArmstrongNo {

    static int power(int rem, int count){

        int mul = 1;
        for(int i=0; i<count; i++){
            mul = mul*rem;
        }
        return mul;
    }

    public int CheckNum(int num){

        int no = num;
        int arm = num;
        int count = 0;
        int rem = 0;
        int sum = 0 ;
        while(no != 0){
            count++;
            no /= 10;
        }
        while(num != 0){
            rem = num%10;
            sum = sum + power(rem, count);
            num /= 10;
        }
        if(sum==arm){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArmstrongNo am = new ArmstrongNo();
        System.out.println("Enter a number to check Armstrong No. or not :");
        int n = sc.nextInt();

        if(am.CheckNum(n)==1){
            System.out.println(n+" is a ArmStrong Number.");
        }else{
            System.out.println(n+" is not a Armstrong No.");
        }

    }
}
