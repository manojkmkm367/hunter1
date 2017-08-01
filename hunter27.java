import java.util.Scanner;

public class hunter27 {
	public static void main(String argh[])throws Exception
	{
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
	int i,j,k,l,x=0;
	System.out.println("Enter the string");
	String a=in.next();
	int n=a.length(),flag=0;String ref1,ref2,text,result="";
	for(i=0;i<n-1;i++)
	{
		ref1=a.substring(i,i+1);
		for(j=i+1;j<n-1;j++)
		{
			ref2=a.substring(j, j+1);
			if(ref1.equals(ref2))
			{
				text=a.substring(i,(j+1));
				StringBuffer rev=new StringBuffer(text);
				rev=rev.reverse();
				String text1 = rev.toString();
				if(text.equals(text1) && text.length()>4)
					{result=text;flag=1;break;}
				
			}
			
			if(flag==1)
				break;
			
		}
		
	}	
	System.out.println(result);
	
	
		}			
	}
