import java.io.IOException;
import java.util.Scanner;

public class island2D {
	public static void main(String[] args)throws IOException{
		Scanner in=new Scanner(System.in);
		int i,j,count=0;
		System.out.println("ENTER THE ARRAY SIZE");
		int n=in.nextInt();
		int[][] a=new int[10][10];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		
		for(i=1;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[i][j]==1)
				{
					if(a[i-1][j]==1)  
					{
						count++;
						a[i-1][j]=0;
					}
					else if( a[i][j-1]==1 )
					{
						count++;
						a[i][j-1]=0;
					}
					else if(a[i+1][j]==1 ||a[i][j+1]==1)
					{
						count++;
					}
						
				}
			}
		}
		System.out.println(count);
}
}
