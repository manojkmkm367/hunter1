import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class main1 {
public static void main(String argh[]) throws IOException
{
	BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> a=new ArrayList<>();
	System.out.println("Enter array size");
	int n=Integer.parseInt(br.readLine());
	for(int i = 0;i<n;i++)
	{
		a.add(Integer.parseInt(br.readLine()));
	}
Collections.reverse(a);
System.out.print(a);
}
}
