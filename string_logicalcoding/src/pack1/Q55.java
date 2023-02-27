package pack1;

import java.util.Scanner;


public class Q55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email id");
		String email = sc.next();
		int i = email.indexOf('@');
		if(i == -1)
		{
			System.out.println(email + " invalid there is no @");
			return;
		}
		int j = email.indexOf('.',i);
		if(j == -1)
		{
			System.out.println(email + " invalid. there is not dot after @");
			return;
		}
		if((i+1) == j)
		{
			System.out.println(email + " invalid. dot should not be immediately after@");
		}
		if(j == email.length() -1)
		{
			System.out.println(email + " invalid. dot should not be at the end");
			return;
		}
		System.out.println(email + " is valid");
	}
}
