package basics;
import java.util.Scanner;
public class Round {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		System.out.printf("%d\n",Math.round(a));
		System.out.printf("%f\n",Math.ceil(a));
		System.out.printf("%f\n",Math.floor(a));
	}

}
