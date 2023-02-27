package pack1;
// searching character it is not available -1
public class Q16 {
	public static void main(String[] args) {
	String s1 = "abcabcabcabc";
    //           0123456789
	
	System.out.println(s1.indexOf('t'));
	System.out.println(s1.indexOf('a',9));
	System.out.println(s1.indexOf('a',10));
	
}
}
