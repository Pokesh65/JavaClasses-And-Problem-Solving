package ProblemSolving;

public class LogicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++){
			int res=(int) Math.floor(Math.pow(i,3)+Math.pow(i,2));
			System.out.print(res+",");
			
		}

	}

}