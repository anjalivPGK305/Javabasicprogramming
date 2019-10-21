package decisionmaking;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int largest;
		if(a>b)
		{
			if(a>c)
			{
				largest = a;
			}
			else
			{
				largest = c;
			}
		}
		else
		{
			if(b>=c)
			{
				largest = b;
			}
			else
			{
				largest = c;
			}
		}
System.out.println("largest number is"+largest);
	}

}
