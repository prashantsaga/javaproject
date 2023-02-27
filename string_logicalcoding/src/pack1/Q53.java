package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q53 {
	public static void main(String[] args) {
	//	String src = "abs"; // this is returning boolean if first char of string is same as from range
		String src = "1abs";
		System.out.println(src);
		String expression = "^[a-z]"; 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        System.out.println(matches.find());
	}
}
// ^ represent starting char of given number