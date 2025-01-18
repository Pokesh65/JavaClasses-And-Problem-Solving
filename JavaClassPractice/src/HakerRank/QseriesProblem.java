package HakerRank;

import java.util.Scanner;

public class QseriesProblem {

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	          
	            
//	            output Should Be :2 6 14 30 62 126 254 510 1022 2046
//	            and : 8 14 26 50 98
	            
	        for (int j = 0; j<n; j++) {
	               a+=b;
	               System.out.print(a+" ");
	               b=b*2;
	            
	            
	        }
	        System.out.println();
//	       
//	        
//
//	        
	        }
	        
	        
	    }


}
