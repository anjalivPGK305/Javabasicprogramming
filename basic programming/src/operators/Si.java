package operators;
import java.util.Scanner;
public class Si {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int n = s.nextInt();
		float r = s.nextFloat();
		float si = (p*n*r)/100;
		System.out.printf("%.2f",si);

	}

}
