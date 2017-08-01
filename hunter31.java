import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class tree {
	public static void main(String argh[])throws Exception
	{
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
	int i,j,k,l,x=0;
	System.out.println("Enter the size");
	int n=in.nextInt();
	int[] input=new int[100];
	for(i=0;i<n;i++)
	{
		input[i]=in.nextInt();
	}
	TreeMap<Integer,ArrayList<Integer>> tr=new TreeMap<Integer, ArrayList<Integer>>();
	for(k=0;k<n/2;k++){
	for(i=0;i<n;i++)
	{
		int product=1;ArrayList<Integer> a1=new ArrayList<Integer>();
		for(j=i;j<n;j++)
		{
		product=product*input[j];
		if(input[j]!=0)
		a1.add(input[j]);
		tr.put(product,a1);
		
		}
	}
	n--;}
	
	Entry<Integer, ArrayList<Integer>> obj=tr.lastEntry();
	System.out.println("max Product is "+obj.getKey()+" and it's objects are"+obj.getValue());
}
}
