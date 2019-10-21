package array;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		int m=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the index");
			a[i] = s.nextInt();
			if(a[i]>=m)
			{
				m=a[i];
			}
		}
		System.out.println(m);

	}

}
