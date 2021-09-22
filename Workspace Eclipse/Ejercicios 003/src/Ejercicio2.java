import java.util.*;
import java.io.*;

public class Ejercicio2 {

	// Programa que dado un numero y un d�gito, nos devuelve si el digito est�
	// contenido en el

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int numtecl = 0, digito = 0;
		boolean siEsta = false;

		do {
			System.out.print("Introduce un n�mero entero: ");
			numtecl = sc1.nextInt();
			System.out.print("Introduce el d�gito que deseas buscar: ");
			digito = sc1.nextInt();
		} while (numtecl < 0);
		while (numtecl != 0) {
			if (numtecl == digito) {
				siEsta = true;
			}
			numtecl = numtecl / 10;
		}
		if (siEsta == false) {
			System.out.println("El d�gito " + digito + " no est� en el n�mero");
		} else {
			System.out.println("El d�gito " + digito + " s� est� en el n�mero");
		}

	}

}
