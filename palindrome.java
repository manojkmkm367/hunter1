import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)throws IOException{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE LIST SIZE");
		int n=in.nextInt();
		LinkedList<String> s=new LinkedList<String>();
		System.out.println("ENTER THE STRING");
		for(int i = 0;i<n;i++){
			s.add(in.next());
		}
		
	for(String a:s){
		int n1 =a.length();
		 StringBuffer a1=new StringBuffer (a.subSequence(0, n1/2));
		 StringBuffer a2=new StringBuffer( a.subSequence(n1/2  +1,n1));
		a2=a2.reverse();
		String b1=String.valueOf(a1);
		String b2=String.valueOf(a2);
		if(b1.equals(b2))
		System.out.println(a+" is a palindrome ");
		else
			System.out.println(a+"is not a palindrome ");
		}
	
	
	}
}
