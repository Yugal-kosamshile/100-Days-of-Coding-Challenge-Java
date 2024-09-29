//Check if a Number is Armstrong
class Armstrong
{
	public static void main(String[]args)
	{
		int n=371;
		System.out.println("Number is :"+n);
		 int temp =n;
		int count=0;
		while(n!=0)
		{
			int d=n%10;
			count++;
			n=n/10;
		}
		System.out.println("Power is : "+count);
		n=temp;
		int sum=0;
		while(n!=0)
		{
		int d=n%10;
		int pow=1;
		for(int i=1;i<=count;i++)
			{
			pow=pow*d;
		   }
		   sum=sum+pow;
		   n=n/10;
		}
			System.out.println("Sum is: "+sum);
			if(temp==sum)
				System.out.println(temp +" is an Armstrong Number");
				else
			    System.out.println(temp +" is Not an Armstrong Number");
				
	}	
}
