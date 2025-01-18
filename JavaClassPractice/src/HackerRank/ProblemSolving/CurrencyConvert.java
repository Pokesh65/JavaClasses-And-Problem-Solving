package HackerRank.ProblemSolving;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sample Input
//		12324.134

//		Sample Output
//		US: $12,324.13
//		India: ₹12,324.13
//		China: ¥12,324.13
//		France: 12 324,13 €

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The value To be converted : ");
		double payment = scanner.nextDouble();
		scanner.close();

//        NumberFormat UsFormat=NumberFormat.getCurrencyInstance(Locale.US);
////      india doesn't have locale format so you should create one 
//        NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
//        NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);

//        String usa=UsFormat.format(payment);
//        String india=indiaFormat.format(payment);
//        String china=chinaFormat.format(payment);
//        String france=franceFormat.format(payment);

		String usa = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//      india doesn't have locale format so you should create one 
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		System.out.println("US: " + usa);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}

}
