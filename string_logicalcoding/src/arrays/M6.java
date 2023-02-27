package arrays;

import java.util.Arrays;

// permutation
public class M6 {
	public static void main(String[] args) {
		//int[]elements = {1, 3, 4, 2};
		//               0  1  2  3
		
		int[]elements = {4, 3, 2, 1};
		//               0  1  2  3
		
		System.out.println("Current permutation:" + Arrays.toString(elements));
		
		if(checkForTheLast(elements))
		{
			reverse(elements, 0);
			System.out.println("next permutation:" + Arrays.toString(elements));
			return;
		}
		
		int i = findDecreasesIndex(elements);
		//System.out.println(i);

		int j = findBiggerElementIndexInTheRightSide(elements, i);
		//System.out.println(j);

		//System.out.println(Arrays.toString(elements));
		swap(elements, i, j);
		//System.out.println(Arrays.toString(elements));

		reverse(elements, i + 1);
		//System.out.println(Arrays.toString(elements));

	}
	static int findDecreasesIndex(int[]elements)
	{
		int index = -1;
		for(int i = elements.length - 2; i >= 0; i--)
		{
			if(elements[i] < elements[i+1])
			{
				index = i;
				break;
			}
		}
		return index;
	}
	static int findBiggerElementIndexInTheRightSide(int[]elements,int i)
	{
		int index = -1;
		for(int j = elements.length - 1; j > i; j--)
		{
			if(elements[j] > elements[i])
			{
				index = j;
				break;
			}
		}
		return index;
	}
	static void swap(int[]elements,int i, int j)
	{
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}

	static void reverse(int[] elements, int i) 
	{
		int middle = i + ((elements.length - i) / 2);
		int temp;
		for (int j = i; j < middle; j++) 
		{
			temp = elements[j];
			elements[j] = elements[elements.length - 1 - (j - i)];
			elements[elements.length - 1 - (j - i)] = temp;
		}

	}
	static boolean checkForTheLast(int[] elements)
	{
		boolean descending = true;
		for(int i = 0; i < elements.length - 1; i++)
		{
			if(elements[i] < elements[i + 1])
			{
				descending = false;
				break;
			}
		}
		return descending;
	}

}
