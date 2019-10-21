package basics;
import java.util.Scanner;
public class Digit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float n = s.nextFloat();
		s.nextLine();
		System.out.printf("%.0f\n",n);
		System.out.printf("%.1f\n",n);
		System.out.printf("%.2f\n",n);
		System.out.printf("%.3f\n",n);
		
	}

}
