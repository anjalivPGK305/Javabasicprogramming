package decisionmaking;
import java.util.Scanner;
public class Nestswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.printf("1)Veg\n2)Nonveg\n");
		int n = s.nextInt();
		System.out.println("Food type");
		char f = s.next().charAt(0);
		switch(n) {
		case 1: System.out.println("Veg");
		switch(f) {
		case 'a': System.out.println("Meals");
		break;
		case 'b': System.out.println("Fried rice");
		break;
		case 'c': System.out.println("Veg biriyani");
		break;
		default : System.out.println("Invalid input");
		}
		break;
		case 2: System.out.println("Non veg");
		switch(f) {
		case 'a': System.out.println("Chicken biriyani");
		break;
		case 'b': System.out.println("Parotta&beaf");
		break;
		case 'c': System.out.println("Chicken fry");
		break;
		default : System.out.println("Invalid input");
		}
		break;
		default: System.out.println("Invalid input");
		}
		}
		
		

	}


