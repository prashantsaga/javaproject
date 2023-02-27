package pack1;
// last index of searching from right to left
public class Q17 {
	public static void main(String[] args) {
		String s1 = "abcabcabcabc";
		//           0123456789

		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('b'));
		System.out.println(s1.lastIndexOf('c',7));
		System.out.println(s1.lastIndexOf('a',7));
		System.out.println(s1.lastIndexOf('b',7));
		System.out.println(s1.lastIndexOf('c',3));
		System.out.println(s1.lastIndexOf('a',3));
		System.out.println(s1.lastIndexOf('b',3));
	}
}
