package arrays;

import java.util.Arrays;

// merging two sorted array
public class M4 {
	public static void main(String[] args) {
		int[] a1 = {1, 5, 20, 42, 55, 69, 88, 91, 500};
		int[] a2 = {11, 30, 51, 79, 101, 150, 201, 360, 421, 551, 619, 818, 9100, 50011};
		int[] a3 = new int[a1.length + a2.length];
		int i = 0, j = 0, k = 0;
		while(i < a1.length && j < a2.length)
		{
			if(a1[i] < a2[j])
			{
				a3[k++] = a1[i++];
			}
			else
			{
				a3[k++] = a2[j++];
			}
		}
		while(i < a1.length)
		{
			a3[k++] = a1[i++];
		}
		while(j < a2.length)
		{
			a3[k++] = a2[j++];
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
	}

}
