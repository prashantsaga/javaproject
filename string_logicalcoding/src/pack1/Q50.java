package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q50 {
	public static void main(String[] args) {
		String src = "hello1abc_test$38%test@hello";
		System.out.println(src);
		String expression = "\\W"; 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// W- represent only allow for special character