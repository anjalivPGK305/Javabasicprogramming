package controlstructures;
import java.util.Scanner;
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		if(n==0 && n==1)
		{
			System.out.println("Yes");
		}
		int a=0;
		int b=1;
		int c=0;
		int m=0;
		for(int i=1;i<=100;i++)
		{
		    c=a+b;
		    if(a==n)
		    {
		    	m++;
		    }
			a=b;
			b=c;
		}
		if(m!=0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
			
		

	}

}
