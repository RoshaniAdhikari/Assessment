package assignment;

public class SourceSecondSmallest {
	public static int getSecondSmallest(int[] arr)// Method takes array of integer as parameter
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
public static void main(String[] args) {
	int[] inputArray = { 23, 45, 32, 22, 20, 96 };
	int result = getSecondSmallest(inputArray);
	System.out.println(result);
}
}
