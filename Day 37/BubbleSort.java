class BubbleSort
{
	public static void main(String[] args)
	{
		int arr[]={50,40,30,20,10};
		int n=arr.length;
		System.out.println("Before Bubble Sorting");
		for (int x: arr)
		{
			System.out.print(x+" ");
		}
		for(int i=0;i<=n-2;i++)
		{
			for (int j=0;j<=n-2-i;j++ )
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("\nAfter Bubble Sorting ");
		for (int x: arr)
		{
			System.out.print(x+" ");
		}
			
		
	} 
}


