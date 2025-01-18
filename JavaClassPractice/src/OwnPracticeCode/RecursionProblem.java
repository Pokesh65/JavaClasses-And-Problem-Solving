package OwnPracticeCode;

public class RecursionProblem {
	static String fun(String name, int num) {
		if (num == name.length()) {
			return "";
		}if (name.charAt(num) == ' ') {
			System.out.print(" ");

		} else if(name.charAt(num)!=' '){
			
			System.out.print("0");
		}
		return fun(name, num + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun("Hello Gokul", 0);

	}

}
