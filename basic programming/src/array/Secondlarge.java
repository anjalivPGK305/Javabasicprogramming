package array;
import java.util.Scanner;
import java.util.Arrays;
public class Secondlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the index");
			a[i] = s.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println(a[size-2]);
		
	}

	}

