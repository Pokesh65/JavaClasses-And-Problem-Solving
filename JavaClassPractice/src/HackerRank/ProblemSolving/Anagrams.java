package HackerRank.ProblemSolving;

import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		if(a.length()!=b.length()){
	        return false;
	       }else{
	        char []A1=a.toUpperCase().toCharArray();
	        char []B1=b.toUpperCase().toCharArray();
	        java.util.Arrays.sort(A1);
	        java.util.Arrays.sort(B1);
	        boolean res=java.util.Arrays.equals(A1,B1);
	        return res;
	       }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	

}
