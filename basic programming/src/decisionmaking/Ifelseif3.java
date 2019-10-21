package decisionmaking;
import java.util.Scanner;
public class Ifelseif3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age>60)
		{
			System.out.println("Old");
		}
		else if(age>20 && age<60)
		{
			System.out.println("Middle age");
		}
		else if(age>12 && age<20)
		{
			System.out.println("Teenage");
		}
		else
		{
			System.out.println("Child");
		}

	}

}
