package object;

public class M17 {
	public static void main(String[] args){
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// Double equals operator always checking memory location
	}
}
