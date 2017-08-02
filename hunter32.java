import java.util.ArrayList;
import java.util.Scanner;

public class hunter32 {
	public static void main(String argh[])throws Exception
	{
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
	int i,j,k,l,x=0,n1;
	System.out.println("Enter the size");
	int n=in.nextInt();n1=n;
	ArrayList<Integer> a1=new ArrayList<Integer>();
	for(i=0;i<n;i++)
	{
		a1.add(in.nextInt());
	}
	ArrayList<Integer> a2=new ArrayList<Integer>();ArrayList<Integer> a3=new ArrayList<Integer>();
	for(int temp:a1)
	a2.add(temp);
	while(n>1)
	{ a3.clear();
		for(i=1;i<n;i++,i++)
		{
			a3.add(a2.get(i));	
		}
		a2.clear();
		for(int temp:a3)
			a2.add(temp);
		n=n/2;
		
	}
	int last=a3.get(0);
	for(i=0;i<n1;i++)
	{
		if(a1.get(i) ==last)
			System.out.println("Value "+last+" is at the  Possition : "+(i+1));
	}	
}
