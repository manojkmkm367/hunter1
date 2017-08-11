import java.io.IOException;
import java.util.Scanner;

public class hunter52 {
	public static void main(String args[])throws IOException{
		Scanner in=new Scanner(System.in);
		String inp1=in.next();
		System.out.println("enter input length");
		int n1=in.nextInt();
		int n=inp1.length();
		System.out.println("The subsets are");
		for(int i=n1-1;i<n;i++)
		{
			String t1=inp1.substring(i,i+1);
			System.out.println(inp1.substring(0,n1-1)+t1);
		}
	}
}
