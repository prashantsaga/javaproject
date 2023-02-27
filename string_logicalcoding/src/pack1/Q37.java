package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q37 {
	public static void main(String[] args) {
		String src = "abcabcabcabc";
		System.out.println(src);
		String expression = "c";
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// By using expression we can get the pattern
// it is pre-defined method.
// combination of all the  matches pattern 
// matches containing all the location of the expression of source(src).
// every matcher of the source.