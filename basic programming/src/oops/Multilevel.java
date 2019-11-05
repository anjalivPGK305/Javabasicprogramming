package oops;
import java.util.Scanner;
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the speed");
		int n = s.nextInt();
		Model m = new Model();
		m.name();
		m.colour();
		m.about();
		m.model();
		m.speed(n);
		

	}

}
