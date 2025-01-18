package OwnPracticeCode;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=63835323;
		int res=0;
		while(num!=0){
			res=res*10+num%10;
			num=num/10;
		}
		System.out.print(res);
	}

}
