package pack1;

public class Q35 {
   public static void main(String[] args) {
	String s1 = "abc xyz hello test 123 java";
	String[]strings = s1.split(" ");
	for(String string : strings)
	{
		System.out.println(string);
	}
}
}
// splitting the string on the basis of space
// it is on of the built in method