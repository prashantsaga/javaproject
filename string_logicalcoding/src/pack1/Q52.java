package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q52 {
	public static void main(String[] args) {
		String src = "a1b2c3d4";
		System.out.println(src);
		String expression = "\\D"; 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// D represent 
// this is searching location character which are alphabetical character.