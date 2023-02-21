package JavaLab;
import java.util.*;

public class SumOfDigits {
	public static void main (String[] args)
	{
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		int sum=0;
		while (num!=0)
		{
			int x=num%10;
			sum=sum+x;
			num=num/10;
		}
		System.out.print(sum);

		n.close();
	}
}