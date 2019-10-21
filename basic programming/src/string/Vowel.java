package string;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a[] = new String[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.next();
		}
		char c;
		for(int i=0;i<n;i++)
		{
			c = a[i].charAt(0);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(a[i]);
			}
		}
		
		


		
		

	}

}
