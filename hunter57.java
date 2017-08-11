import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hunter57{
	  public static void main(String args[])throws IOException{
		    
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    //  int inp[]=new int[100];
		    // System.out.println("Enter the array size");
		    // int n  =Integer.parseInt(br.readLine());
		    // System.out.println("Enter the array Elements");
		    // for(int k=0;k<n;k++)
		    // inp[k]=Integer.parseInt(br.readLine());  
		    int[] inp={2,3,4,5,6,7,8,9,10,11,12,13,2,20,30,40};   // FOR EXAMPLE
		    int n=inp.length;   
		    int i,j,sum=0,flag=0;
		    for(i=0;i<n;i++)
		    {
		      for(j=i+1 ;j<n;j++)
		      {
		        if(inp[i]==inp[j])
		        {
		          flag=1;
		          System.out.println(inp[i]);  // System.exit(0);
		        }        
		      }
		    }	    
		    if(flag==0)
		    System.out.println(    "No One Can Repetted"); 
		  }
		
