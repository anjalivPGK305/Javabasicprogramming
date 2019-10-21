package decisionmaking;
import java.util.Scanner;
public class Ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks");
		int n = s.nextInt();
		if(n>=25)
		{
			System.out.println("Exam passed");
		}
		else
		{
			System.out.println("Exam failed");
		}
		

	}

}
