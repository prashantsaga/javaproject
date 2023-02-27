package pack3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A19 {
	public static void main(String[] args) {
		String src = "abc abc abc";
		System.out.println(src);
		String expression = "abc";
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(src);
		while(matches.find())
		{
			System.out.println(matches.group() + ":" + matches.start());
		}
	}

}
