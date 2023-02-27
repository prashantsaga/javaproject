package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q48 {
	public static void main(String[] args) {
		String src = "abc          xyz         hello             123";
		System.out.println(src);
		String expression = "\\s+"; 
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
//this is searching location for all the space , even multiple space
// but print only for starting space one after another