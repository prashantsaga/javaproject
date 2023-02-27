package pack3;

import java.util.Scanner;

public class A16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		String line = sc.nextLine();
		int fromIndex = 0, toIndex = line.indexOf(' ');
		String word;
		while(toIndex != -1)
		{
			word = line.substring(fromIndex,toIndex);
			System.out.println(word);
			fromIndex = toIndex + 1;
			toIndex = line.indexOf(' ',fromIndex);
		}
	}

}
