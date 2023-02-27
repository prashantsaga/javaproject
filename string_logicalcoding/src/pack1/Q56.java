package pack1;


import java.util.Scanner;

//read the word from both the ends one by one
//Given string: abc hello 123 test java btm j2ee placements hardwork
//output should be: abc  hardwork hello placements 123 j2ee test btm java
public class Q56 {
	public static void main(String[] args) {
		String s1 = "abc hello 123 test java btm j2ee placements hardwork";
		int fromIndex = 0;
		int toIndex = s1.indexOf(" ");
		String[] arr = s1.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - i - 1] + " ");
		}

	}
}