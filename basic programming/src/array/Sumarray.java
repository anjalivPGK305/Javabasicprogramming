package array;
import java.util.Scanner;
public class Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the array1size");
		int[] a = new int[10];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array1Index"+i+"");
			a[i] = s.nextInt();
		}
		//System.out.println("Enter the array2size");
		int[] b = new int[10];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the array2Index"+i+"");
			b[i] =s.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]+b[i]);
		}

	}

}
