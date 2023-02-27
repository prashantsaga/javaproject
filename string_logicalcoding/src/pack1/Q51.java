package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q51 {
	public static void main(String[] args) {
		String src = "123 abc hello";
		System.out.println(src);
		String expression = "\\S"; 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// S represent all digit but space is count
// opposite of space