import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class hunter45 {
	public static void main(String argh[])throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> list=new ArrayList<String>();
	for(int i=0;i<6;i++)
	{
		list.add(br.readLine());
	}
	for(int i=0;i<6;i++)
	{
		String temp=list.get(i);
		int count=0;
			for(String tt:list)
				{if(tt.equals(temp))
					count++;	}
			
			if(count%2==0);
		else
		{
			System.out.println(temp);break;
		}
	}
}
}
