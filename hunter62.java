import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class hunter62 {
	  public static void main(String args[])throws IOException{
		    
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    ArrayList<Integer> list=new ArrayList<Integer>();
		    int i;
		    for(i=0;i<10;i++)
		    {
		    	list.add(Integer.parseInt(br.readLine()));
		    }
		    int min=Collections.min(list);
		    int max=Collections.max(list);
	  
	  System.out.println("Max benefit is : "+(max-min)+" thousand");
	  }

}
