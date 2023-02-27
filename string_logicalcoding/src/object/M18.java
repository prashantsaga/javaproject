package object;

public class M18 {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = "java";
		String s4 = s1 + "va";
		String s5 = "ja" + s2;
		String s6 = "ja" + "va";
		String s7 = s1 + s2;
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);// s3 and s6 both are pointing the same object
		System.out.println(s3 == s7);
		
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		System.out.println(s4 == s7);
		
		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		
		System.out.println(s6 == s7);
		//
	}
}