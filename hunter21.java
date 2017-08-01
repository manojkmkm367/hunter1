import java.util.Scanner;

public class Sum {
public static void main(String argh[])throws Exception
{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int i,j,k,l;
	int[][] a=new int[10][10];	int[][] b=new int[10][10];
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=in.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			b[i][j]=a[i][j];
		}
	}
	
			
			
			
				for(k=0;k<n;k++)
				{
					if(a[0][k]==0)
					{
						for(l=0;l<n;l++)
						{
							b[l][k]=0;
						}
					}
				}
			
			
				for(k=0;k<n;k++)
				{
					if(a[k][0]==0)
					{
						for(l=0;l<n;l++)
						{
							b[k][l]=0;
						}
					}
				}
			
			
			
		
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println("");
	}
	
}
}
