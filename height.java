import java.util.Arrays;
import java.util.Scanner;

public class height {
	public static void main(String[] args)
	 {
	  System.out.println("ENTER THE NUMBER OF STUDENTS: ");
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  Float[] Arr=new Float[n];
	  System.out.println("ENTER THE HEIGHTS: ");
	  for(int i=0;i<n;i++)
	   {
	     Arr[i]=s.nextFloat();
	    }
	Arrays.sort(Arr);
	System.out.println("4th tallest student "+Arr[n-4]);
	System.out.println("Enter the number you want to find");
	int k=s.nextInt();
	System.out.println("entered student height "+Arr[n-k]);
}
}
