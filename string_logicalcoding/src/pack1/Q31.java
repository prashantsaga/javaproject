package pack1;

import java.util.Scanner;

public class Q31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter line of chars");
		String line = sc.nextLine(); // abc xyz hello
		                             // 0123456789
		// print word by word
		int fromIndex = 0, toIndex = line.indexOf(' ');
		String word;
		while(toIndex != -1)
		{
			word = line.substring(fromIndex, toIndex);
			System.out.println(word);
			fromIndex = toIndex + 1;
			toIndex = line.indexOf(' ', fromIndex);
		}
		word = line.substring(fromIndex);
		System.out.println(word);
	}

}
/*
fromIndex = 0;
toIndex = 3;
word = abc
fromIndex = 4;

*/