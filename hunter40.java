import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class hunter40 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> s=new LinkedList<String>();
		System.out.println("ENTER THE NUMBER");
		int num=Integer.parseInt(br.readLine());
		int n=num,i,sum=0;
		for(i=0;n>0;i++)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		String res=String.valueOf(sum);
			s.add(res);
	for(String a:s){
		int n1 =a.length();
		 StringBuffer a1=new StringBuffer (a.substring(0, n1/2));
		 StringBuffer a2=new StringBuffer( a.substring(n1/2 ));
		a2=a2.reverse();
		String b1=String.valueOf(a1);
		String b2=String.valueOf(a2);
		if(b1.equals(b2))
		System.out.println(num+" is a palindrome ");
		else
			System.out.println(num+" is not a palindrome ");
		}
		}
	}
