package OwnPracticeCode;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=20;
		boolean isprime=true;
		for(int i=2;i<prime;i++){
			if(prime%i==0){
				isprime=false;
				break;
				
			}
		}
		
		if(isprime){
			System.out.println("This is Prime Number :"+prime);
		}
		else{
			System.out.println("This is Not Prime Number :"+prime);
		}

	}

}
