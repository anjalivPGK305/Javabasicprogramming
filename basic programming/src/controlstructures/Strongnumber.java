package controlstructures;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i=1,r,sum=0,fact;
		int num=n;
		while(n!=0)
		{
			fact=1;
			r=n%10;
			for(i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			n=n/10;
			
		}
		if(sum==num)
		{
			System.out.println("Strong number");
		}
		else
			System.out.println("Not a strong number");
		
		s.close();

	}

}
