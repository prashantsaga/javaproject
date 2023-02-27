package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q36 {
	public static void main(String[] args) {
		String src = "abcabcabcabc";
		System.out.println(src);
		String expression = "abc";
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// regx is called regular expression
// patern and matcher both are available in regx
// both are extensively for use validating formate in order to 