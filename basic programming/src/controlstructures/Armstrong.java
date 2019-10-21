package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Armstrong {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int a = Integer.parseInt(br.readLine());
		int b=a;
		int c=a;
		int count=0,r,sum=0;
		while(c!=0)
		{
			count++;
			c=c/10;
		}
		while(a!=0)
		{
			r=a%10;
			sum=(int)((double)sum + Math.pow(r,count));
			a=a/10;
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
			
		}

	}


