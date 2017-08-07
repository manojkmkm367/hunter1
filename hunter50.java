import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hunter50 {

	public static void main(String argh[])throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int d=Integer.parseInt(br.readLine());
	int e=Integer.parseInt(br.readLine());
	int r=0;
	double c=0;
	int dd=d;
	while(d>0)
	{
	   r=d-e ;
	   d=r;
	c=c+1;
	}
	if(dd%2==1)
		c=c-0.5;
	System.out.println(c);
}
}
