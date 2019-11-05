package oops;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.printf("1)add\n2)sub\n3)mul\n4)div\n5)mod\n");
		int n = s.nextInt();
		Opera op = new Opera();
		switch(n) {
		case 1:
			Opera.add(a,b);
			break;
		case 2:
			Opera.sub(a,b);
			break;
		case 3:
			Opera.mul(a,b);
			break;
		case 4:
			Opera.div(a,b);
			break;
		case 5:
			Opera.mod(a,b);
			break;
			default :
			System.out.println("Invalid Input");
		}
	}
}
class Opera{	
	public static void add(int a,int b) {
		System.out.printf("Add->%d",a+b);
	}
	public static void sub(int a,int b) {
		System.out.printf("Sub->%d", a-b);
	}
	public static void mul(int a,int b) {
		System.out.printf("Mul->%d", a*b);
	}
	public static void div(int a,int b) {
		System.out.printf("Div->%d", a/b);
	}
	public static void mod(int a,int b) {
		System.out.printf("Mod->%d",a%b);
	}

}
