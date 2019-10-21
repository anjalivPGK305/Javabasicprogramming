package basics;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the first number");
		float a = s.nextFloat();
		System.out.println(a);
		System.out.println("Enter the second number");
		float b = s.nextFloat();
		System.out.println(b);
	}

}
