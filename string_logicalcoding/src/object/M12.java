package object;

public class M12 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = s1 + s1;   // String s2 = "nullnull"
		System.out.println(s2.length());
		System.out.println(s2);
	}
}
