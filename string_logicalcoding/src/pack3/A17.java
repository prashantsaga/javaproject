package pack3;

public class A17 {
	public static void main(String[] args) {
		String s1 = "abc hello 1 te java";
		String s2 =" ";
		for(int i = 0, j = s1.length()-1; j >= 0; i++,j--)
		{
			if(s1.charAt(i) == ' ')
			{
				s2 += ' ';
				j++;
				continue;
			}
			if(s1.charAt(j) != ' ')
			{
				s2 += s1.charAt(j);
			}
			else
			{
				i--;
			}
		}
		System.out.println(s2);
	}

}
