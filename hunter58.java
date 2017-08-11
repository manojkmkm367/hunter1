import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class hunter58 {
	  public static void main(String args[])throws IOException{
		    
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    //  int inp[]=new int[100];
		    // System.out.println("Enter the array size");
		    // int n  =Integer.parseInt(br.readLine());
		    // System.out.println("Enter the array Elements");
		    // for(int k=0;k<n;k++)
		    // inp[k]=Integer.parseInt(br.readLine());  
		    int[] inp={7,6,23,19,10,11,9,3,15,27};   // FOR EXAMPLE
		    int n=inp.length,count=0;   
		    int dif=4;								// for EXAMPLE
		  
		    int i,j,sum=0;
		    for(i=0;i<n;i++)
		    {
		      for(j=i+1 ;j<n;j++)
		      {
		    	  int temp=Math.abs(inp[i]-inp[j]);
		        if(temp==dif)
		        {
		         count++;
		        }        
		      }
		    }	    
		   
		    System.out.println( count); 
		  }
		}
