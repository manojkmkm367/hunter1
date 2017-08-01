import java.util.*;

public class hunter24 {

	public static void main(String[] args) {
		int result=1,i,flag=0,j,t;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int[] a=new int[10];
	System.out.println("enter the element in the array");
	for(i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	System.out.println("enter the target element");
	t=in.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]+a[j]==t)
			{
				System.out.println("the element are "+a[i]+" "+a[j]);flag=1;  break;
			}
		}
	}

	if(flag==0)
	{
		System.out.println("no element present here");
	}
	
	}
}
