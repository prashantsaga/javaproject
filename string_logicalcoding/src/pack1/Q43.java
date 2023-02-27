package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q43 {
	public static void main(String[] args) {
		String src = "a1b2c3d4hello6";
		System.out.println(src);
		String expression = "[a-e1-5]"; //without separator specifying one after another 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// a to e is one set and 1 - 5 another without gap also we can supply in command