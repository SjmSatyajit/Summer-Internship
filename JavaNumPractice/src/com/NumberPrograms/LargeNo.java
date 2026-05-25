package com.NumberPrograms;

import java.util.Scanner;
public class LargeNo {

    static void CheckNum(int x, int y, int z){

        if(x>y && x>z){
            System.out.println("Among 03, "+x+" is the largest number.");
        } else if (y>x && y>z) {
            System.out.println("Among 03, "+y+" is the largest number.");
        }else {
            System.out.println("Among 03, "+z+" is the largest number.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int c = sc.nextInt();

        LargeNo.CheckNum(a, b, c);

    }
}
