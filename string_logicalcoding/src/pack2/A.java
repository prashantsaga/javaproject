package pack2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
check the balance in the brackets

(abc)	==> balanced
(abc	==> not balanced
 abc)	==> not balanced
(abc]	==> not balanced
(abc}	==> not balanced
[abc}	==> not balanced
[abc(a){test}]	==>  balanced
[abc(a)test}]	==>  not balanced
{[abc(a)test}]	==>  not balanced
[abc(a{test}])	==>  not balanced
braket symbols are : ({[<

 */
import java.util.Scanner;

class A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an input to check the balancing");
		String s1 = sc.next();
		String brackets = "({[<>]})";
		String stack = "";
		char c1;
		int index;
		boolean balanced = true;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 =  s1.charAt(i);
			index = brackets.indexOf(c1);
			if(index != -1)
			{
				if(index <= 3)
				{
					stack += c1;
				}
				else if(stack.length() != 0 && compareSymetric(c1, stack.charAt(stack.length() - 1)))
				{
					stack = stack.substring(0, stack.length() - 1);
				}
				else
				{
					balanced = false;
					break;
				}
			}
		}
		System.out.println(stack.length() == 0 && balanced ? "balanced" : "not balanced");
	}
	static boolean compareSymetric(char closing, char opening)
	{
		return (opening == '(' && closing == ')') ||
				(opening == '[' && closing == ']') ||
				(opening == '{' && closing == '}') ||
				(opening == '<' && closing == '>');
	}
}