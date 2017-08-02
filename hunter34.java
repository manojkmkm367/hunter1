import java.util.Scanner;

public class hunter34 {
	public static void main(String argh[])throws Exception
{
	    String small=null,high=null;
		Scanner in=new Scanner(System.in);
		String inp=in.nextLine();
	    int size=inp.length();
	    if(size==2)
	    {
	        high="99";small="10";
	    }else if(size==3)
	    {
	    	high="999";small="100";
	    }else if(size==4)
	    {
	    	high="9999";small="1000";
	    }else if(size==5)
	    {
	    	high="99999";small="10000";
	    }
	    else if(size==6)
	    {
	    	high="999999";small="100000";
	    }
	    else if(size==7)
	    {
	    	high="9999999";small="1000000";
	    }
	    else if(size==8)
	    {
	    	high="99999999";small="10000000";
	    }else if(size==9)
	    {
	    	high="999999999";small="100000000";
	    }else if(size==10)
	    {
	    	high="9999999999";small="1000000000";
	    }
	    if(high.equals(inp))
	    System.out.println("Not possible");
	    else
	    System.out.println("Smallest number In the digit is : "+small+" \nHeighest Number in the digit is : "+high);
}
}
