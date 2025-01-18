package ProblemSolving.StartPattern;

public class StaticMethod {
	
	static int a=10;
	
	static int  Add(int b){
		a=a+b;
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethod st=new StaticMethod();
		
		System.out.println(Add(10));;
	}

}
