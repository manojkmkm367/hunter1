import java.util.*;
import java.util.Map.Entry;

public class hunter29 {
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
		int sum=0;ArrayList<Integer> a1=new ArrayList<Integer>();
		for(j=i;j<n;j++)
		{
		sum=sum+input[j];
		a1.add(input[j]);
		}
		tr.put(sum,a1);
	}
	n--;}
	
	
	Entry<Integer, ArrayList<Integer>> obj=tr.lastEntry();
	System.out.println("max Sum is "+obj.getKey()+" and it's objects are "+obj.getValue());
}
}
