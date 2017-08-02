import java.util.*;

public class hunter43 {

	public static void main(String[] args) {
		int result=1,i,flag=0,j,t,n=0,m=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the String");
		String text=in.next();
		int[] number=new int[100];
		String[] letter=new String[100];
		String[] num=text.split("[0-9]");String[] lt=text.split("[a-z]");
	
		for(String temp:num)
		{
			letter[n]=temp;n++;
		}
		for(String temp1:lt)
			{
			try{
				int t1=Integer.parseInt(temp1);
				number[m]=t1;m++;
				}
				catch(Exception e)
				{
					;
				}
			}
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<number[i];j++)
			{
				System.out.print(letter[i]);
			}
		}
	
	}
}
