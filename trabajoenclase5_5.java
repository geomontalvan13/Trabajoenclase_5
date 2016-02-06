import java.util.Scanner;

public class trabajoenclase5_5
{
	public static void main(String args[]){
		int x, factorial;
		x=1;
		factorial=1;
		while (x<=10) {
			factorial = factorial*x;
			System.out.print(x);
			System.out.print("*");
			System.out.print(factorial);

			x=x+1;
		}
		System.out.print("=");
		System.out.print("factorial: ");
		System.out.println(factorial);
	}
}