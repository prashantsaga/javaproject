package object;

public class M16 {
	public static void main(String[] args){
		String s1 = new String("abc");
		String s2 = new String("abc");// s2 pointing to other object.
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
