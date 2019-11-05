package oops;
import java.util.Scanner;
public class Single2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of Singer");
		String str = s.next();
		Singer n = new Singer();
		n.song();
		n.about();

	}

}
