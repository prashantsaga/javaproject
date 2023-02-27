package pack1;
// escaped character backward slice not count
public class Q5 {
	public static void main(String[] args) {
	//	String s1 = "abc"xyz"; // In the middle of the double code straight away.
		String s1 = "abc\"xyz"; // It should be escaped is a backword slice
		System.out.println(s1.length());// count 6 character or 1 cottation total 7
		System.out.println(s1);
	}
}
