package HackerRank.ProblemSolving;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,4,2,1};
		int indx=0;
		int limit=a.length;
		int remainingJump=a.length;
		
		while(indx<limit){
			if(a[indx]>limit){
				System.out.println("Out Of Range");
			}
			
			remainingJump-=a[indx];
			indx+=a[indx];
			
			if(remainingJump==0) {
				System.out.println("proper jump");
				break;
			}
			
			else if(remainingJump<0) {
				System.out.println("invalid jump");
				break;
			}
		}

	}

}
