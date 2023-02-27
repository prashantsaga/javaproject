package pack1;

import java.util.Scanner;

public class Q32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter line of chars");
		String line = sc.nextLine(); // abc xyz  hello
		                             // 0123456789
		// print word by word space 2 and 3three but print one after another
		int fromIndex = 0, toIndex = line.indexOf(' ');
		String word;
		while(toIndex != -1)
		{
			word = line.substring(fromIndex, toIndex);
			System.out.println(word);
			toIndex = checkSpaces(toIndex, line);
			fromIndex = toIndex + 1;
			toIndex = line.indexOf(' ', fromIndex);

		}
		word = line.substring(fromIndex);
		System.out.println(word);
	}
	static int checkSpaces(int toIndex, String line)
	{
		while(line.charAt(toIndex + 1) == ' ') 
		{
			toIndex ++;
		}
		return toIndex;
	}
}
