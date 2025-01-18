package OwnPracticeCode;

public class CountZero {
	static void zeroCout(int num){
		int count=0;
		while(num!=0){
			if(num%10==0){
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
	
	static void SumOfDigit(int num){
		int res=0;
		int res2=0;
		while(num>0){
			res+=num%10;
			num=num/10;
		}
		while(res>0){
		res2+=res%10;
		res=res/10;
		}
		System.out.println(res2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zeroCout(500000);
		SumOfDigit(5599);
	}

}
