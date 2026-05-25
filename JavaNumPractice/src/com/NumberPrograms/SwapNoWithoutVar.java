package com.NumberPrograms;

import java.util.Scanner;

public class SwapNoWithoutVar {

    public void Swap(int x, int y){

        System.out.println("Before Swap a = "+x+", b = "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap a = "+x+", b = "+y);
    }
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first no.:");
        int a = Sc.nextInt();
        System.out.println("Enter the Second no.:");
        int b = Sc.nextInt();

        SwapNoWith3rdVar sv = new SwapNoWith3rdVar();
        sv.Swap(a, b);
    }
}
