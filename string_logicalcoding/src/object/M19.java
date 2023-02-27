package object;

public class M19 {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = s1.concat(s2);
		String s4 = "ja".concat(s2);
		String s5 = s1.concat("va");
		String s6 = "ja".concat("va");

		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);
		System.out.println(s3 == s6);
	}
}