package pack4;
import java.util.Arrays;
public class WaterTrapping3 {
		public static void main(String[] args) {
			Object[] elements = {"test", 10, 4.5, 5, 2, 1.4, "xyz", "hello", 4, 9, 1.8};
			System.out.println(Arrays.toString(elements));
			int left = 0, right = elements.length - 1;
			Object temp;
			while(true)
			{
				while(elements[left] instanceof String)
				{
					left++;
				}
				while(elements[right] instanceof Number)
				{
					right--;
				}
				if(left >= right)
				{
					break;
				}
				temp = elements[left];
				elements[left] = elements[right];
				elements[right] = temp;
				left++;
				right--;
			}
			left = 0;
			while(true)
			{
				if(elements[left] instanceof Number)
				{
					break;
				}
				left ++;
			}		
			int stringsCount = left;
			right = elements.length - 1;
			while(true)
			{
				while(elements[left] instanceof Integer)
				{
					left++;
				}
				while(elements[right] instanceof Double)
				{
					right--;
				}
				if(left >= right)
				{
					break;
				}
				temp = elements[left];
				elements[left] = elements[right];
				elements[right] = temp;
				left++;
				right--;
			}
			System.out.println("Total number of strings:" + stringsCount);
			System.out.println("total number of int:" + (left - stringsCount));
			System.out.println("total number of doubles:" + (elements.length - left));
			System.out.println(Arrays.toString(elements));
			int stringsStartingIndex = 0, stringsEndingIndex = stringsCount - 1;
			int intStartingIndex = stringsEndingIndex + 1, intEndingIndex = left - 1;
			int doubleStartingIndex = left, doubleEndingIndex = elements.length - 1;
//			System.out.println(stringsStartingIndex);
//			System.out.println(stringsEndingIndex);
//			System.out.println(intStartingIndex);
//			System.out.println(intEndingIndex);
//			System.out.println(doubleStartingIndex);
//			System.out.println(doubleEndingIndex);
			sortStrings(stringsStartingIndex, stringsEndingIndex, elements);
			sortIntegers(intStartingIndex, intEndingIndex, elements);
			sortDoubles(doubleStartingIndex, doubleEndingIndex, elements);
			System.out.println("final array:" + Arrays.toString(elements));	
		}
		static void sortStrings(int from, int to, Object[] elements)
		{
			String s1, s2;
			for(int i = from; i < to; i++)
			{
				for(int j = i; j < to; j++)
				{
					s1 = (String) elements[j];
					s2 = (String) elements[j + 1];
					if(s1.compareTo(s2) > 0)
					{
						elements[j] = s2;
						elements[j + 1] = s1;					
					}
				}
			}
		}
		static void sortIntegers(int from, int to, Object[] elements)
		{
			Integer s1, s2;
			for(int i = from; i < to; i++)
			{
				for(int j = i; j < to; j++)
				{
					s1 = (Integer) elements[j];
					s2 = (Integer) elements[j + 1];
					if(s1.compareTo(s2) > 0)
					{
						elements[j] = s2;
						elements[j + 1] = s1;					
					}
				}
			}	
		}
		static void sortDoubles(int from, int to, Object[] elements)
		{
			Double s1, s2;
			for(int i = from; i < to; i++)
			{
				for(int j = i; j < to; j++)
				{
					s1 = (Double) elements[j];
					s2 = (Double) elements[j + 1];
					if(s1.compareTo(s2) > 0)
					{
						elements[j] = s2;
						elements[j + 1] = s1;					
					}
				}
			}	
		}
	}