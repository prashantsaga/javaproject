package pack1;
// character by character reverse order
public class Q14 {
	public static void main(String[] args) {
		String s1 = "hello123xyz";
		       //    012345678
		
		for(int i = s1.length()-1; i >= 0;  i--)
		{
			System.out.println(s1.charAt(i));
		}
	}

}
