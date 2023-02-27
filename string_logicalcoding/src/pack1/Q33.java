package pack1;

import java.util.Scanner;

// space comma semicolon separate
public class Q33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter line of chars");
		String line = sc.nextLine();
		int fromIndex = 0, toIndex = getToIndex(line, 0);
		String word;
		while (toIndex != -1) 
		{
			word = line.substring(fromIndex, toIndex);
			System.out.println(word);
			toIndex = nextSeparators(line, toIndex);
			fromIndex = toIndex + 1;
			toIndex = getToIndex(line, fromIndex);
		}
		word = line.substring(fromIndex);
		System.out.println(word);

	}

	static int getToIndex(String line, int toIndex) 
	{
		boolean isAvailable = false;
		for (int i = toIndex; i < line.length(); i++) 
		{
			if (" ,;".indexOf(line.charAt(i)) != -1) 
			{
				toIndex = i;
				isAvailable = true;
				break;
			}
		}
		if (!isAvailable) 
		{
			toIndex = -1;
		}
		return toIndex;
	}

	static int nextSeparators(String line, int toIndex) {
//		if (toIndex != -1) 
//		{
			while (" ,;".indexOf(line.charAt(toIndex + 1)) != -1) 
			{
				toIndex++;
			}
	//	}
		return toIndex;
	}
}

/*
 abc  xyz;  hello, ; , ; test ; , 123,,,,,yek;;;;;,,,789 9098, 7878
 o/p should be
 abc
 xyz
 hello
 test
 123
 yek
 789
 9098
 7878
	  
 */