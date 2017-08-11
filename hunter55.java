import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class hunter55 {
	public static void main(String args[])throws IOException{
		Scanner in=new Scanner(System.in);
		int inp1[]={1,2,3,4,5,6,7,8};
		int n=in.nextInt();
		int i;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(i=n;i<inp1.length;i++)
		{
			list.add(inp1[i]);
		}
		for(int j = 0;j<n;j++)
		{
			list.add(inp1[j]);
		}
		
		System.out.println(list);
	}
}
