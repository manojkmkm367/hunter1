import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class subarraymaxsum {
	public static void main(String[] args)throws IOException{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE LIST SIZE");
		int n=in.nextInt();
		int i,x=0;
		int[] a=new int[100];int[] b=new int[100];int[] c=new int[100];
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int max=b[i];
		b=a;
		//for(i=0;i<n;i++)
		//System.out.println(b[i]);
		for(i=0;i<n;i++)
		{
			if(max<b[i])
				{max=b[i];
				x=i;
				}
		}
		
	
		int max1=b[i];
		
		for(i=0;i<n;i++)
		{
			if(max1<b[i])
				{if(b[i]!=max)
				max1=b[i];
				}
		}
		for(i=0;i<n;i++)
		{
			if(max1==a[i] )
			{
				for(int j = i;j<n;j++)
				{
				
					ar.add(a[j]);
					if(a[j]==max)
						break;
				}
			}
		}
System.out.println("OUTPUT  : "+ar);
}
}
