package pack3;

public class A24 {
	public static void main(String[] args) {

		//	int[] a = {9,9,4,2};
			int[] a = {10, 22, 9, 33, 21, 50, 41, 60, 22,68,90};
			int maxSeq = 0;
			int tempMaxSeq = 0;
			int num = 0;
			for (int i = 0; i < a.length; i++) {
				num = a[i];
				tempMaxSeq = 0;
				for (int j = i+1; j < a.length; j++) 
				{
					if(num <= a[j])
					{
						num = a[j];
						tempMaxSeq++;
						if(maxSeq < tempMaxSeq)
						{
							maxSeq = tempMaxSeq;
						}
					}
				}
				if(i == a.length-2 && num <= a[a.length-1])
				{
					maxSeq++;
				}
			}
			System.out.println(maxSeq);
			
		}
}
