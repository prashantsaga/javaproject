package object;

public class M15 {
	public static void main(String[] args){
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); // it wont check the content.it check only memory location.
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
