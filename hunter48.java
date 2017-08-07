import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hunter48 {
	public static void main(String argh[])throws Exception
	{
	int i,j,count=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n1 = 0,n2=0,flag=0;

	System.out.println("String 1:");
	String a = null,b = null;
	
		a=br.readLine();
	
	n1=a.length();
	

	System.out.println("String 2:");

		b=br.readLine();
	
	n2=b.length();
	
		for(j=0;j<n1-n2;j++)
		{
			String temp=a.substring(j, j+n2);
			if(temp.equals(b))
				{flag=1;
			break;}
			count++;
			
		}
	
	
	if(flag==1)
	{
		System.out.println(count);
	}
	else
		System.out.println(-1);
}
}
