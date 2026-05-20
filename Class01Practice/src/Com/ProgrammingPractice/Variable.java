package Com.ProgrammingPractice;

public class Variable {
	
	//Static Variable
	static int hey = 20;
	int a = 30;
	
	public static void main(String[] args) {
		
		//Local Variable
		int hey = 10;
		System.out.println(hey);
		System.out.println(Variable.hey);
		
		Variable v1 = new Variable();
		System.out.println(v1.a);
	}
}
