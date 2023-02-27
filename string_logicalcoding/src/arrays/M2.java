package arrays;

public class M2 {
	public static void main(String[] args) {
		int[]heights = {2, 1, 4, 0, 3, 0, 1, 2, 0, 3, 0, 2};
		int capacity = 0, leftMax, rightMax, minMax, current;
		
		for(int i = 1; i < heights.length-1; i++)
		{
			leftMax = heights[i];
			for(int j = i-1; j >= 0; j--)
			{
				if(heights[j] > leftMax)
				{
					leftMax = heights[j];
				}
			}
			rightMax = heights[i];
			for(int j = i+ 1; j < heights.length; j++)
			{
				if(heights[j] > rightMax)
				{
					rightMax = heights[j];
				}
			}
			minMax = leftMax < rightMax ? leftMax : rightMax;
			current = heights[i];
			if( current < minMax)
			{
				capacity += (minMax - current);
			}
		}
		System.out.println(capacity);
	}

}
