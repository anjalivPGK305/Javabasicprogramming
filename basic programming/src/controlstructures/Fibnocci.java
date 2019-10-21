package controlstructures;
import java.util.Scanner;
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.printf("%d%d",a,b);
		for(int i=0;i<=8;i++)
		{
			int c=a+b;
			System.out.print(c);
			a=b;
			b=c;
			
		}

	}

}
