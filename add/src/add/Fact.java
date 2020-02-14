package add;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+"is"+fact);

	}

}
