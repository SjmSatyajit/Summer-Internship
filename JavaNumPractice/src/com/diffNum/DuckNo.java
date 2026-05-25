package com.diffNum;

import java.util.Scanner;
public class DuckNo {
    public boolean duck(String num){

        int n = num.length();

        if(num.charAt(0) == '0'){
            return false;
        }
        for(int i=1; i<n; i++){

            if(num.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String a = sc.nextLine();

        DuckNo dc = new DuckNo();
        if(dc.duck(a)){
            System.out.println(a+" is a Duck Number.");
        }else{
            System.out.println(a+" is not a Duck number.");
        }

    }
}
