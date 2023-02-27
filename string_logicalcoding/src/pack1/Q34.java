package pack1;

/*
  Reversing the string by retaining white spaces
  s1 = "abc hello 1 te java";
      output- ava jet1o 1 le hcba
 */
public class Q34 {
	public static void main(String[] args) {
		String s1 = "abc hello 1 te java";
		String s2 = "";
		for (int i = 0, j = s1.length()- 1; j >= 0; i++, j--) 
		{
			if (s1.charAt(i) == ' ') // left to right add white space
			{
				s2 += ' ';
				j++;
				continue;

			}
			if (s1.charAt(j) != ' ') // right to left non white space
			{
				s2 += s1.charAt(j);
			}
			else
			{
				i--;
			}
		}
		//System.out.println(s1);
		System.out.println(s2);
	}
}

// output- ava jet1o 1 le hcba