import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class hunter56 {
	public static void main(String args[])throws IOException{
		Scanner in=new Scanner(System.in);
		int inp1[]={15, 5, -20, 30, -45};
		int n=inp1.length;
		int i,j,temp=0,flag=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
		for( j = i+1;j<n;j++)
		{	
			int t1=Math.abs(inp1[i])-Math.abs(inp1[j]);
			
			list.add(t1);
		}
		}
		
		
			for(i=0,j=0;flag==0;i++,j--)
			{
				for(int x:list)
				{					if(x==i || x==j){				temp=x;		flag=1;			}
				}	
				if(flag==1)
				{break;  }
				
		   	}
				

				
			for(i=0;i<n;i++)
			{
			for( j = i+1;j<n;j++)
			{	
				int t1=Math.abs(inp1[i])-Math.abs(inp1[j]);
				
				if(temp==t1)
					System.out.println(inp1[i]+","+inp1[j]);
			}
			}
	}
}
