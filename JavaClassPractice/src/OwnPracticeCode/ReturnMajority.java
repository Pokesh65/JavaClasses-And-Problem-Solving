package OwnPracticeCode;

public class ReturnMajority {
	
	static void major(int...arr){
		int element=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(element==0){
				
				element=arr[i];
				
			}else if(count<0){
				
				element=arr[i];
			}
			if(element==arr[i]){
				
				count++;
				
			}else {
				count--;
			}
			
		}
		System.out.println(element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		major(2,23,4,5,24,63,32,3,12,4,4,2,1,1,0,0,4,5,5);
		
		

	}

}
