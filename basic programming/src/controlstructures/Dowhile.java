package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dowhile {

	public static void main(String[] args)throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0,a;
		do
		{
			//System.out.println("Enter the number");
			a = Integer.parseInt(br.readLine());
			if(a>0)
			{
				sum=sum+a;
			}
			
			
		}while(a>0);
	
		System.out.println(sum);
		

	}

}
