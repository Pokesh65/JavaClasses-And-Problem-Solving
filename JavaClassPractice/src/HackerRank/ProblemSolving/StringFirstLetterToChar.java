package HackerRank.ProblemSolving;

import java.util.Iterator;
import java.util.Scanner;

public class StringFirstLetterToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan=new Scanner(System.in);
		
//		String line=scan.nextLine();
		
		String line="hello pokesh im you here";
		
		

		String []words=line.split(" ");
		
		StringBuilder stbuild=new StringBuilder();
		
		for(String  word:words){
			
			String capts=word.substring(0,1).toUpperCase()+word.substring(1);
			
//			String capts=word.substring(0,1).toUpperCase()+word.substring(1);
			
//			System.out.println(capts);
			stbuild.append(capts+" ");
			
			
		}
		String value=stbuild.toString();
		
		System.out.println(value);
		
		
	}

}
