import java.util.*;
import java.io.*;

public class hunter651
{ 
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int c=sc.nextInt();
    int []d=new int[c];
    for(int i=0;i<c;i++)
    {
      
      d[i]=sc.nextInt();
    }
    for(int i=0;i<c;i++)
    {
      
      for(int j=i+1;j<c;j++)
      {
        if(d[i]==d[j])
        {
          d[i]=0; d[j]=0;  
          //d.remove(i);
          //d.remove(j);
        }
        
        
      }
    }
        ArrayList<Integer>list=new ArrayList<Integer>();
    for(int x:d)
    {
      if(x>0)
      list.add(x);
    }

    System.out.println(list);
    
  }
}
