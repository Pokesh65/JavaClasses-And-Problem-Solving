package OwnPracticeCode;

public class SlidingWindow {
	static String Towpoint(int ...arr){
		String l="",r="";
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				l+=arr[i]+5+" ";
			}else {
				
				r+=arr[i]+10+" ";
			}
			

		}
		return l+" "+r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Towpoint(1,2,3,4,5,6,7,8,9);
		System.out.println(Towpoint(1,2,3,4,5,6,7,8,9));

	}

}
