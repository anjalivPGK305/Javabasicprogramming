package array;
import java.util.Scanner;
public class Secondlarge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int[] a = new int[size];
		int temp;
		for(int k=0;k<size;k++)
		{
			System.out.println("Enter the index");
			a[k] = s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
			}
		System.out.println(a[size-2]);
		}
	}


