package HackerRank.ProblemSolving;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
//	Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the 
//	string into tokens. We define a token to be one or more consecutive English 
//	alphabetic letters. Then, print the number of tokens, followed by each token 
//	on a new line.
//
//	Note: You may find the String.split method helpful in completing this challenge.
	
//	In Java, Regular Expressions (regex) are used for pattern matching and text manipulation. The java.util.regex package provides classes to work with regular expressions. The two primary classes are:
//
//		1. **Pattern**: A compiled representation of a regular expression.
//		2. **Matcher**: An engine that performs matching operations on an input string using a Pattern.
//
//		### Common Regex Syntax in Java
//
//		#### Character Classes
//		- .: Matches any character except newline.
//		- \d: Matches any digit ([0-9]).
//		- \D: Matches any non-digit.
//		- \w: Matches any word character (alphanumeric + _).
//		- \W: Matches any non-word character.
//		- \s: Matches any whitespace character.
//		- \S: Matches any non-whitespace character.
//
//		#### Quantifiers
//		- *: Matches 0 or more occurrences.
//		- +: Matches 1 or more occurrences.
//		- ?: Matches 0 or 1 occurrence.
//		- {n}: Matches exactly n occurrences.
//		- {n,}: Matches n or more occurrences.
//		- {n,m}: Matches between n and m occurrences.
//
//		#### Anchors
//		- ^: Matches the beginning of a line.
//		- $: Matches the end of a line.
//		- \b: Matches a word boundary.
//		- \B: Matches a non-word boundary.
//
//		#### Groups
//		- ( ... ): Capturing group.
//		- (?: ... ): Non-capturing group.
//		- (?= ... ): Positive lookahead.
//		- (?! ... ): Negative lookahead.
//		- (?<= ... ): Positive lookbehind.
//		- (?<! ... ): Negative lookbehind.
//
//		#### Escaping Special Characters
//		Special characters like ., *, +, ?, etc., must be escaped using a backslash (\) when used as literal characters. For example, \. matches a literal period.
//
//		---
//
//		### Using Regex in Java
//		Here’s a quick example:
//
//		java
//		import java.util.regex.*;

//	
//
//		*Explanation:*
//		- \\d+ matches one or more digits.
//		- matcher.group() retrieves the matched substring.
//
//		### Commonly Used Methods
//		- Pattern.compile(String regex): Compiles a regex into a pattern.
//		- matcher.find(): Finds the next match in the input.
//		- matcher.matches(): Checks if the entire input matches the regex.
//		- matcher.group(): Retrieves the matched substring.
//		- matcher.start(): Returns the start index of the match.
//		- matcher.end(): Returns the end index of the match.
//
//		Let me know if you need a specific example or more details!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner scan = new Scanner(System.in);
//	        String s = scan.nextLine();
		 String s="He is a very very good boy, isn't he?";
	        // Write your code here.
//	        scan.close();
//		 String ss=s.replaceAll("[!,?._'@]+"," ");
		 
	        String sss[]=s.split("[^A-Za-z]+");
	        System.out.println(sss.length);
	        for(String sc:sss){
	            System.out.println(sc);
	        }
	        
	        Scanner in = new Scanner(System.in);
			int testCases =in.nextInt();
			in.nextLine();	
			while(testCases>0){
				String pattern1 = in.nextLine();
	          	//Write your code
	            Pattern p = Pattern.compile("/^([A-Z])(.+)");
	            Matcher m = p.matcher(pattern1);
	            boolean b = m.matches();
	            if(b){
	                System.out.println("Valid");
	            }else{
	                System.out.println("Invalid");
	            }
			}
	}

}
