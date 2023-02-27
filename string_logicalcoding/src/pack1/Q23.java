package pack1;
// string emutable(further not change)
public class Q23 {
	public static void main(String[] args) {
		String s1 = "hello";
		s1.concat("test");
		System.out.println(s1); // concation method internally using '+' operator
	}
}
