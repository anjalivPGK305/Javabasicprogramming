package operators;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int dummy = a;
		a = b;
		b = dummy;
		System.out.println(a);
		System.out.println(b);
	}

}
