package oops;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String str = s.next();
		Carnew c = new Carnew(str);
		Carnew.a();
		Carnew.b();
		Carnew.m();
		Carnew.display(str);
	}
}
class Carnew
{
	String str;
	public Carnew(String str) {
		str = str;
	}
	public static void m() {
		System.out.println("Welcome car m");
		System.out.println("Welcome car model 12342");
	}
	public static void b() {
		System.out.println("Welcome car b");
		System.out.println("Welcome car model jhfg");
	}
	public static void a() {
		System.out.println("Welcome car a");
		System.out.println("Welcome car model kdjw");
	}
	
	public static void display(String str) {
		System.out.println(str);

	}

}
