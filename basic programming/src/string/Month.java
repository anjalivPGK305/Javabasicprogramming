package string;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = ""+ a.charAt(3) + a.charAt(4);
		switch(b)
		{
		case "01": System.out.println("January");
		break;
		case "02": System.out.println("February");
		break;
		case "03": System.out.println("March");
		break;
		case "04": System.out.println("April");
		break;
		case "05": System.out.println("May");
		break;
		case "06": System.out.println("June");
		break;
		case "07": System.out.println("July");
		break;
		case "08": System.out.println("August");
		break;
		case "09": System.out.println("September");
		break;
		case "10": System.out.println("October");
		break;
		case "11": System.out.println("November");
		break;
		case "12": System.out.println("December");
		break;
		default:
			System.out.println("Invalid input");
		}
		
		
		
		
		
		
		

	}

}
