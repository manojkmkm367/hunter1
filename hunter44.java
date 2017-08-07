import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class hunter44 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NUMBER");
		int n=Integer.parseInt(br.readLine());ArrayList<Integer> res=new ArrayList<Integer>();HashSet<Integer> result=new HashSet<Integer>();
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=1;j<4000000;j++)
			{
				int count=0;
				int temp=j;
				String str=String.valueOf(temp);
				while(temp!=0)
				{
					int digit=temp%10;
					temp=temp/10;
					if(digit==3 || digit==4)
						count++;
				}
				if(count== str.length())
				{
					result.add(j);
				}
	
			}
		}
		
		
		for(int x:result)
			res.add(x);
	
		Collections.sort(res);

		System.out.println(res.get(n-1));

		}
	}
