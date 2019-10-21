package array;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		int sum=0,sum1=0,b=0,c=0;
		float e,o;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the index"+i+"");
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
				b++;
			}
		}
		for(int i=0;i<size;i++) 
			{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sum1=sum1+a[i];
				c++;
				
			}
			
			}
		e=sum/b;
		o=sum1/c;
		System.out.println(e);
		System.out.println(o);
	}
}
		
			
		
			
				
				
		
		

	


