package pack4;

import java.util.Arrays;

public class WaterTrapping2 {
	public static void main(String[] args) {
		int[] blockHeights = {2, 0, 1, 2, 1, 3, 2, 0, 3, 1, 2};
		int[] leftMaxValues = new int[blockHeights.length];
		int[] rightMaxValues = new int[blockHeights.length];
		leftMaxValues[0] = blockHeights[0];
		rightMaxValues[blockHeights.length - 1] = blockHeights[blockHeights.length - 1];
		for(int i = 1; i < blockHeights.length; i++)
		{
			if(leftMaxValues[i - 1] > blockHeights[i])
			{
				leftMaxValues[i] = leftMaxValues[i - 1];
			}
			else
			{
				leftMaxValues[i] = blockHeights[i];
			}
		}
		for(int i = blockHeights.length - 2; i >= 0; i--)
		{
			if(blockHeights[i] > rightMaxValues[i + 1])
			{
				rightMaxValues[i] = blockHeights[i];
			}
			else
			{
				rightMaxValues[i] = rightMaxValues[i + 1];
			}
		}
		//			System.out.println(Arrays.toString(blockHeights));		
		//			System.out.println(Arrays.toString(leftMaxValues));		
		//			System.out.println(Arrays.toString(rightMaxValues));		

		int leftMax, rightMax, minMax, waterCapacity = 0;		
		for(int i = 1; i < blockHeights.length - 1; i++)
		{
			leftMax = leftMaxValues[i];
			rightMax = rightMaxValues[i];
			minMax = leftMax < rightMax ? leftMax : rightMax ;
			if(minMax > 0 && (minMax - blockHeights[i]) > 0)
			{
				waterCapacity += (minMax - blockHeights[i]);
			}
		}
		System.out.println(waterCapacity);		
	}
} 