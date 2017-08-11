import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class hunter59{
	  public static void main(String args[])throws IOException{
		    
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    LinkedList<Integer> list1=new LinkedList<Integer>();
		    LinkedList<Integer> list2=new LinkedList<Integer>();
		    LinkedList<Integer> sum=new LinkedList<Integer>();
		    int i=0;
		    System.out.println("Enter the list size");
		    int n1=Integer.parseInt(br.readLine());
		    System.out.println("Enter the list 1");
		    for(i=0;i<n1;i++)
		    {
		    	list1.add(Integer.parseInt(br.readLine()));
		    }
		    System.out.println("Enter the list 2");
		    for(i=0;i<n1;i++)
		    {
		    	list2.add(Integer.parseInt(br.readLine()));
		    }
		    
		    for(int p=0;p<n1;p++)
		    {
		    	int s=list1.get(p)+list2.get(p);
		    	sum.add(s);
		    	
		    }
		    System.out.println(sum);
	  }

}
