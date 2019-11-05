package oops;
import java.util.Scanner;
public class Hierarchybook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Persons");
		 int a = s.nextInt();
		System.out.println("Enter the number of days");
		 int b = s.nextInt();
		System.out.println("Enter the room type");
		String c = s.next();
		System.out.println("Enter the tariff for single person");
		double f = s.nextDouble();
		System.out.println("Enter the month");
		int d = s.nextInt();
		Leanseason ob = new Leanseason();
		Peakseason obj = new Peakseason();
		double v=ob.roomBook(a,b,f);
		switch(d)
		{
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
		ob.lean(v);
		
		break;
		case 4:
		case 5:
		case 6:
			
			obj.peak(v);
			break;
			
		}
		
		
	}

}
class Book
{
	int a,b,d,m;
	String c;
	double f;
	Scanner s = new Scanner(System.in);
	double roomBook(int a,int b,double f) {
		double total = a*b*f;
		return total;
	}
	
}
class Leanseason extends Book {
	void lean(double total) {
		double t;
		System.out.println("Enter the discount");
		int m = s.nextInt();
		double tottariff = total-(25*f)/100;
		
			System.out.println("Total Tariff:"+tottariff);
		
		
	}
	
}
class Peakseason extends Book{
void peak(double tot)
{
	double t;
	System.out.println("Enter the peak charge");
int j = s.nextInt();

	 tot = (a*b*f)*m;
	System.out.println("Total Tariff:"+tot);
}
	
}