package DressShop;

import java.util.Scanner;

public class PalinfromYesNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner sc=new Scanner(System.in);
		String A = "Madaaa";
//		int len = A.length();
//		char ch;
////	        String A=sc.next();
//		for (int i = len - 1; i <= A.length() - 1; i--) {
//			if (i < 0) {
//				break;
//			}
//			ch = A.charAt(i);
//			System.out.print(ch);
//		}
		
		
		
//		String A=sc.next();
//        String Result="";
//        char letter;
//        for(int i=0;i<A.length();i++){
//             letter=A.charAt(i);
//            Result=letter+Result;
//        }
//        if(Result.equals(A)){
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
//        }
//        System.out.println(Result +" "+A);
		
		
//		char []c=A.toCharArray();
//		boolean flag=true;
//		for(int i=0;i<A.length();i++){
//			if(c[i]!=c[c.length-1-i]){
//				flag=false;
//			}	
//		}
//		System.out.println(flag?"Yes":"No");
		
		char LCa;
		char RCa;
		boolean flag=true;
		for(int i=0;i<A.length();i++){
			LCa=A.charAt(i);
			RCa=A.charAt(A.length()-1-i);
			if(LCa!=RCa){
				flag=false;
			}
			
		}
		System.out.println(flag? "Yes It's Palindrome":"No it's Not A Palindrome");
		 
	
	}

}
