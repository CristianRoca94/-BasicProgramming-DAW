import java.util.*;
import java.io.*;

public class Ejercicio1 {

	// Programa que devuelve el numero de digitos pares que hay en el 
	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numtecl = 0, pares = 0;

		do {
			System.out.print("Introduce un n�mero entero: ");
			numtecl = sc.nextInt();
		} while (numtecl < 0);
		while (numtecl != 0) {
			if (numtecl % 2 == 0) {
				pares++;
			}
			numtecl = numtecl / 10;
		}
		System.out.println("El n�mero tiene " + pares + " n�meros pares");
	}
}
