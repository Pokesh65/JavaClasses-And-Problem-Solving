package HackerRank.ProblemSolving;

import java.util.Scanner;


public class JavaString {
	
	  static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        largest=s.substring(0,k);
	        smallest=s.substring(s.length()-k,s.length());
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1.String Problem
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        String c=A+B;
	        int Lx=A.compareTo(B);
	        
	        String Ac=A.substring(0,1).toUpperCase()+A.substring(1);
	        String Bc=B.substring(0,1).toUpperCase()+B.substring(1);
	        System.out.println(Ac);
	        
	        
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println(c.length());
	        if(Lx>=0){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	        System.out.println(A+" "+B);
	      
//1.Second Problem
	        System.out.println(getSmallestAndLargest("welcometojava",3));

	}

}
