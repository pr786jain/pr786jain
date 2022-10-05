//Bubble sort 
import java.util.*;
class B
{
	
	 void get(int arr[], int n)
	{
		System.out.println("sorted array Element :");
		for(int i=0; i<n; i++)
         System.out.print(arr[i] + " ");
		
	}
}
class A
{
	void input(int arr[],int n)
	{

		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>=arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}


					}


	    }
	}   
	public static void main(String s[])
	{
		
		System.out.println("Enter the Size of array Element ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	    int [] arr=new int[n];
	     System.out.println("Enter the unsorted  array Elemnet :");
	    for(int i=0; i<n; i++)
	    {
	    	arr[i]=sc.nextInt();
		}
			A obj=new A();

         obj.input(arr,n);
         B ob=new B();
		ob.get(arr,n);
		


	}
	    
}
