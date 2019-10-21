package decisionmaking;
import java.util.Scanner;
public class Ifelseif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark = s.nextInt();
		if(mark>90)
		{
			System.out.println("Grade A");
		}
		else if(mark>=70 && mark<=90)
		{
			System.out.println("Grade B");
		}
		else if(mark>=45 && mark<70)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
