import java.util.InputMismatchException;
import java.util.Scanner;


public class DividirPorZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			
			System.out.println("numero: ");
			int a = s.nextInt();
			System.out.println("Divisor");
			int b = s.nextInt();
			
			System.out.println(a / b);
			
		}
		catch(InputMismatchException e1){
			System.out.println("Input");
		}
		catch(ArithmeticException e1){
			System.out.println("Input");
		}
		

	}

}
