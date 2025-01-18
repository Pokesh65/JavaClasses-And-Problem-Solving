package HackerRank.ProblemSolving;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class newCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double payment=scan.nextDouble();
		
		
	
		String usa=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
		String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		
		System.out.println("US :"+usa);
		System.out.println("INDIA :"+india);
		System.out.println("CHINA :"+china);
		System.out.println("FRANCE :"+france);
	}

}
