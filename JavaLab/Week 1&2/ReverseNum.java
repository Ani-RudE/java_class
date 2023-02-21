package JavaLab;
import java.util.*;

public class ReverseNum {
	public static void main (String[] args)
	{
		Scanner n=new Scanner(System.in);
        int num;
        num=n.nextInt();
	int gg=num;
		int a=0;
		while (num!=0)
		{
			int rem=num%10;
			a=a*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of " + gg + " is " + a);

        n.close();
	}
}