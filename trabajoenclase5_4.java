import java.util.Scanner;

public class trabajoenclase5_4
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int x, factorial, valor;
		System.out.print("Ingrese un valor: ");
		valor=teclado.nextInt();
		x=1
		factorial=1
		While (x<=valor) {
			factorial=factorial*x;

			x=x+1;
		}
		System.out.print("el factorial de los numeros ingresados es: ");
		System.out.println(factorial);
	}
}