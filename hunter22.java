import java.util.*;

public class hunter22 {

	public static void main(String[] args) {
		int result=1;
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>(5);

		   a.add(20);
		   a.add(15);
		   a.add(30);
		   a.add(45);
		   a.remove(num-1);
		for(Integer b:a)
		{
			result*=b;
		}
		System.out.println(result);
}
	}
