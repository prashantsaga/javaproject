package object;

public class M13 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = s1 + null;
		String s3 = null + s1;
		String s4 = s1 + s1;
//		String s4 = null + null;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
//		System.out.println(s5);
	}
}
