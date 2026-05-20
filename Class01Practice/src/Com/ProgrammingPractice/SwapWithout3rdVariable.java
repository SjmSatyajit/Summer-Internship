package Com.ProgrammingPractice;
import java.util.Scanner;

public class SwapWithout3rdVariable {
	
	public static void swapWithoutThird(int a, int b) {
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swap : a = " + a + ", b = " + b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first variable:");
		int x = sc.nextInt();
		System.out.println("Enter the second variable:");
		int y = sc.nextInt();
		
        swapWithoutThird(x, y);
        
        sc.close();
	}

}
