import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class hunter60 {
	  public static void main(String args[])throws IOException{
		    
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    LinkedList<Integer> list1=new LinkedList<Integer>();
		    LinkedList<Integer> list2=new LinkedList<Integer>();
		    LinkedList<Integer> sum=new LinkedList<Integer>();
		    int i=0;
		    System.out.println("Enter the Array size");
		    int n1=Integer.parseInt(br.readLine());
		    System.out.println("Enter the shorted array");
		    for(i=0;i<n1;i++)
		    {
		    	list1.add(Integer.parseInt(br.readLine()));
		    }
		    System.out.println("Enter the rotatted array");
		    for(i=0;i<n1;i++)
		    {
		    	list2.add(Integer.parseInt(br.readLine()));
		    }
		    int p;
		    for( p=0;p<n1;p++)
		    {
		    	if(list1.get(p)==list2.get(0))
		    		break;
		    	
		    	
		    }
		    System.out.println(p+1);
	  }

}
