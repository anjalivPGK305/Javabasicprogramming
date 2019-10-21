package controlstructures;
import java.util.Scanner;
public class Lcmhcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int min,hcf=0;
		min = (a<b)?a:b;
		for(int i=min;i>0;i--)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
				break;
			}
			
		}
		System.out.println(hcf);
		System.out.println("Enter two numbers");
		int x = s.nextInt();
		int y = s.nextInt();
		int max,lcm;
		max=(x>y)?x:y;
		for(int i=max;;i++)
		{
			if(i%x==0 && i%y==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
			
			
		

	}

}
