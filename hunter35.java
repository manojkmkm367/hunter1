import java.util.Scanner;

public class hunter35 {
	public static void main(String argh[])throws Exception
{
		int i,j,count,flag=0;
		Scanner in=new Scanner(System.in);
		String inp=in.nextLine();
	    int n=inp.length();
	    char[] ch=inp.toCharArray();
	    for(i=0;i<n;i++)
	    {
	    	 count=0;
	    	for(j=0;j<n;j++)
	    	{
	    		if(ch[i]==ch[j])
	    			count++;
	    	}
	    	if(count%2!=0)
	    		flag=1;
	    }
	    
	    
	    if(flag==0)
	    {
	    	System.out.println("It is double string");
	    }
	    else
	    	System.out.println("It Not a double string");
}
}
