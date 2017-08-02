import java.util.LinkedList;
import java.util.Scanner;

public class hunter37{
	public static void main(String argh[])throws Exception
{
		int x=0,flag=0;
			Scanner in=new Scanner(System.in);
			LinkedList<String> s=new LinkedList<String>();
			System.out.println("ENTER THE STRING");
			String inp=in.next();
			
			for(int i = 0;i<inp.length();i++)
			{
				String temp=inp.substring(0,i )+(inp.substring(i+1));
				s.add(temp);
			}
		for(String a:s){x++;
			int n1 =a.length();
			 StringBuffer a1=new StringBuffer (a.subSequence(0, n1/2));
			 StringBuffer a2=new StringBuffer( a.subSequence(n1/2  +1,n1));
			a2=a2.reverse();
			String b1=String.valueOf(a1);
			String b2=String.valueOf(a2);
			if(b1.equals(b2))
			{System.out.println(a+" is a palindrome "+" when removing a Charecter "+inp.charAt(x-1)+" at index "+(x-1));flag=1;break;}
			else
				flag=0;		
			}
		if(flag==0)
		System.out.println("Not possible ");
		
		}
	
