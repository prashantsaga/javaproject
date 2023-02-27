package pack1;

public class Q29 {
	public static void main(String[] args) {
		String s1 = "abchelloxyzabchelloxyz";
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("hello"));
		System.out.println(s1.indexOf("xyz"));
		System.out.println(s1.indexOf("test"));
		System.out.println(s1.indexOf("abcd"));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("xyz"));
		System.out.println(s1.indexOf("hello",5));
		System.out.println(s1.indexOf("abc",15));//searching for string 
		
	}

}
// if string is not available we will getting -1
// if string is available we will getting index value