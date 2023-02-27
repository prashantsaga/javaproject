package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q54 {
	public static void main(String[] args) {
		//	String src = "abs"; 
			String src = "1abs";
			System.out.println(src);
			String expression = "[a-z]$"; 
			Pattern pattern = Pattern.compile(expression);
	        Matcher matches = pattern.matcher(src);
	        System.out.println(matches.find());
		}
}
// $ represent ending character is available true if number is not available in end false
// ending character is checking.