
package oops;
import java.util.Scanner;

public class Studdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name;
		int roll;
		System.out.println("Enter the name");
		name = s.next();
		System.out.println("Enter the Roll Number");
		roll = s.nextInt();		
		System.out.println("Enter the marks:");
		int m1=s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int m4 = s.nextInt();
		int m5 = s.nextInt();
		int tot = m1+m2+m3+m4+m5;
		int avg = tot/5;
		Student st = new Student(name,roll);
		st.detail(name,roll);
		st.mark(m1,m2,m3,m4,m5);
		st.total(tot);
		st.average(avg);

	}

}
