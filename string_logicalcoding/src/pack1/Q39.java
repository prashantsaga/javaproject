package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q39 {
	public static void main(String[] args) {
		String src = "a1b2c3d4hello6";
		System.out.println(src);
		String expression = "[a-k]"; // range -as a separation starting to end
		Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        
        while(matches.find())
        {
        	System.out.println(matches.group()+ ":" + matches.start());
        }
	}
}
// Regular expression