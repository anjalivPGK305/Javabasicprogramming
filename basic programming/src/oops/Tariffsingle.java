package oops;
import java.util.Scanner;
public class Tariffsingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seasonbook ob = new Seasonbook();
		ob.roomBooking();
		ob.roomBook();
	}
}
class Booking {
	Scanner s = new Scanner(System.in);
	int a,b;
	double f;
	String c;
	void roomBooking() {
		System.out.println("Enter the number of Persons");
		 a = s.nextInt();
		System.out.println("Enter the number of days");
		 b = s.nextInt();
		System.out.println("Enter the room type");
		c = s.next();
		System.out.println("Enter the tariff for single person");
		f = s.nextInt();

	}
		
	}

class Seasonbook extends Booking{

	public void roomBook() {
		// TODO Auto-generated method stub
		
		double tot=a*b*f;

		System.out.println(tot);
		
	}
	

}

