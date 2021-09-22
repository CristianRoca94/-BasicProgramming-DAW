import java.util.*;
import java.io.*;

public class Ejercicio2 {

	// Programa que dado un numero y un dígito, nos devuelve si el digito está
	// contenido en el

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int numtecl = 0, digito = 0;
		boolean siEsta = false;

		do {
			System.out.print("Introduce un número entero: ");
			numtecl = sc1.nextInt();
			System.out.print("Introduce el dígito que deseas buscar: ");
			digito = sc1.nextInt();
		} while (numtecl < 0);
		while (numtecl != 0) {
			if (numtecl == digito) {
				siEsta = true;
			}
			numtecl = numtecl / 10;
		}
		if (siEsta == false) {
			System.out.println("El dígito " + digito + " no está en el número");
		} else {
			System.out.println("El dígito " + digito + " sí está en el número");
		}

	}

}
