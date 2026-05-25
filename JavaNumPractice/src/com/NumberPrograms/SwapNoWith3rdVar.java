package com.NumberPrograms;

import java.util.Scanner;
public class SwapNoWith3rdVar {

    public void Swap(int x, int y){

        System.out.println("Before Swap a = "+x+", b = "+y);
        int z = x;
        x = y;
        y = z;
        System.out.println("After Swap a = "+x+", b = "+y);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int a = sc.nextInt();
        System.out.println("Enter the Second no.:");
        int b = sc.nextInt();

        SwapNoWith3rdVar sv = new SwapNoWith3rdVar();
        sv.Swap(a, b);
    }
}
