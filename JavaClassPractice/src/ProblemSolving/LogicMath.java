package ProblemSolving;

public class LogicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=1;i<=n;i++){
			int res=(int) Math.floor(Math.pow(i,3)+Math.pow(i,2));
			
			System.out.print(res+",");
		}
		System.out.println();
		int va=2;
		for(int i=1;i<=n;i++){
			
			System.out.print(va+",");
			int res1=(int)Math.floor((va*2)+2);
			va=res1;
			
		}

	}

}
