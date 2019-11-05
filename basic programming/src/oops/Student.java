package oops;

public class Student {
	String name;
	int roll;
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}

	public void mark(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		System.out.println("Marks of the student:");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		/*System.out.println("Total marks:");
		int tot = i+j+k+l+m;
		System.out.println(tot);
		System.out.println("Average mark:");
		int avg = tot/5;
		System.out.println(avg);*/
	}

	public void detail(String name, int roll) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(roll);
		
	}

	public void total(int tot) {
		// TODO Auto-generated method stub
		System.out.println("Total marks:");
		System.out.println(tot);
		
	}

	public void average(int avg) {
		// TODO Auto-generated method stub
		System.out.println("Average marks:");
		System.out.println(avg);
		
	}


}
