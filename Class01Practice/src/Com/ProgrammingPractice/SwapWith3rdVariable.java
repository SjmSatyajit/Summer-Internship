package Com.ProgrammingPractice;
import java.util.Scanner;
public class SwapWith3rdVariable {
	
	
	public static void swapUsingThird(int a, int b) {

        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap : a = " + a + ", b = " + b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first variable:");
		int x = sc.nextInt();
		System.out.println("Enter the second variable:");
		int y = sc.nextInt();
		
        swapUsingThird(x, y);
        
        sc.close();
	}

}
