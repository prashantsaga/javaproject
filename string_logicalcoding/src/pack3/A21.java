package pack3;

public class A21 {
	public static void main(String[] args) {
	  int[]blockedheight = {2,1,0,2,1,2,3};
	  int leftMax = 0, rightMax = 0, minMax, waterCapacity = 0;
	  
	  for(int i = 1; i < blockedheight.length-1; i++)
	  {
		  leftMax = rightMax ;
		  for(int j = 0; j < i; j++)
		  {
			  if(leftMax < blockedheight[j])
			  {
				  leftMax = blockedheight[j];
			  }
		  }
		  for(int j = i+1; j < blockedheight.length; j++)
		  {
			  if(rightMax < blockedheight[j])
			  {
				  rightMax = blockedheight[j];
			  }
			  minMax = leftMax < rightMax ? leftMax : rightMax;
			  minMax = leftMax < rightMax ? leftMax : rightMax;
				if(minMax > 0 && (minMax - blockedheight[i]) > 0)
				{
					waterCapacity += (minMax - blockedheight[i]);
				}
			  System.out.println(waterCapacity);
		  }
	  }
	}

}
