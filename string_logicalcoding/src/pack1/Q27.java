package pack1;

public class Q27 {
	public static void main(String[] args) {
		String s1 = "hello ";
		char[] elements = s1.toCharArray();
		for (int i = 0; i < elements.length / 2; i++) 
		{
			char temp = elements[i];
			elements[i] = elements[elements.length - 1 - i];
			elements[elements.length - 1 - i] = temp;
		}
		s1 = new String(elements);
		System.out.println("final:" + s1);
	}
}
