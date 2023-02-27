package pack3;

public class A22 {
	public static void main(String[] args) {
		int[]blockedHeight = {2,1,0,3,2,0,2,1};
		int leftMax = 0, rightMax = 0, minMax, waterCapacity = 0;
		for(int i = 1; i < blockedHeight.length-1; i++)
		{
			leftMax = rightMax = 0;
			for(int j = 0; j < i; j++)
			{
				if(leftMax < blockedHeight[j])
				{
					leftMax = blockedHeight[j];
				}
			}
			for(int j = i+1; j < blockedHeight.length; j++)
			{
				if(rightMax < blockedHeight[j])
				{
					rightMax = blockedHeight[j];
				}
			}
			minMax = leftMax < rightMax ? leftMax : rightMax;
			if(minMax > 0 && (minMax - blockedHeight[i] > 0))
			{
				waterCapacity += (minMax - blockedHeight[i]);
			}
		}
		System.out.println(waterCapacity);
	}

}
