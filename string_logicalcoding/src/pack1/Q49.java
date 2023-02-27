package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q49 {
	public static void main(String[] args) {
		String src = "hello1abc_test$38%test@hello";
		System.out.println(src);
		String expression = "\\w"; 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// w represent all number or letter even under score allowed 
// w - represent word character
// all alphabet or digit(a-z,A-Z, 0 to 9 or _) or underscore only allow