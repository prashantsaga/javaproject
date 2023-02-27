package arrays;

import java.util.Arrays;

// find the first positive missed number from the given array
/*
 1. length = 5;
 2. Replace all -ve values with zero
 3. for => if(elements[i] <= length)
        elements[elements[i]-1] = -1;
 4. for => if(elements[i] > 0)
         { sop("missed" + (i+1))
            break;
            }
 */
public class M7 {
	public static void main(String[] args) {
		int[]elements = {3, 1, 5, 2, 6, 9};
		System.out.println(Arrays.toString(elements));
		for(int i = 0; i < elements.length; i++)
		{
			if(elements[i] < 0)
			{
				elements[i] = 0;
			}
		}
		for(int i = 0; i < elements.length; i++)
		{
			if(elements[i] <= elements.length && elements[i] >0)
			{
				elements[elements[i]-1] = -1;
			}
		}
		for(int i = 0; i < elements.length; i++)
		{
			if(elements[i] > 0)
			{
				System.out.println("missed :" + (i+1));
				break;
			}
		}
	}

}
