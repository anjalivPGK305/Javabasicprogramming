package basics;

import java.util.Scanner;
public class Disp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		//s.nextLine();
		int n = s.nextInt();
		//s.nextLine();
		String b = s.nextLine();
		int m = s.nextInt();
		//s.nextLine();
		
		System.out.printf("%-15s %03d\n",b,m);
		

	}

}
