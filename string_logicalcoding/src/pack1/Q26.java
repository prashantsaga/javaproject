package pack1;

// reverse string
public class Q26 {
	public static void main(String[] args) {
/*		String s1 = "abc xyz 123", s2 = "";
		System.out.println("initial:" + s1);
		char[] c1 = s1.toCharArray();
		for (int i = c1.length - 1; i >= 0; i--)
			s2 = s2 + c1[i];
		{
			System.out.println("final:" + s2);
		}
	}
}
*/
     String s1 = "abcxyz123hello";
            //    0123456789
      String s2 = s1.substring(0, 3);// 0-inclusive, 3-exclusive
      String s3 = s1.substring(4, 7);
      String s4 = s1.substring(8, 11);
      String s5 = s1.substring(10, 10);
      String s6 = s1.substring(2, 6);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s5);
      System.out.println(s6);
	}
}
