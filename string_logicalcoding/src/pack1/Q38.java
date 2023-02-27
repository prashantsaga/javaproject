package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q38 {
	public static void main(String[] args) {
		String src = "abc;abc;abc;abc;hello;123";
		System.out.println(src);
		String expression = ";";
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// if gives true then matches
// as long as matches are there true
// if matches are not there false