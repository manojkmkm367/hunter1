
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class main1 {
public static void main(String argh[]) throws IOException
{
	BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
	TreeSet<Character> tr=new TreeSet<>();
	System.out.println("Enter the string");
	String ip=br.readLine();
	char[] ch=ip.toCharArray();
	for(char c:ch)
	{
		tr.add(c);
	}
	for(char c1:tr)
	{
		System.out.print(c1);
	}
}
}
