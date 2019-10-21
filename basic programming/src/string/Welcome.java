package string;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				c++;
				for(int j=0;j<c;j++)
				{		
					System.out.print("*");
				}
				System.out.print(str.charAt(i));
				for(int k=0;k<c;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.print(str.charAt(i));
			}
				
		}
				

	}

}
