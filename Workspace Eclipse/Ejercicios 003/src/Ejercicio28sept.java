import java.util.Scanner;

/**
 * Ejercicio de suma aritmética de dos números en base octal
 * 
 * @param dos numeros en base octal
 * @Autor Cristian Roca Flores
 */

public class Ejercicio28sept {
	public static void main(String[] args) throws InterruptedException {
		long n1, n2, sum = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean llevada = false;

		do {
			System.out.print("Introduce el primer número en base octal: ");
			n1 = teclado.nextLong();
			System.out.println("Introduce el segundo número en base octal: ");
			n2 = teclado.nextLong();
			if (esOctal(String.valueOf(n1)) && esOctal(String.valueOf(n2))) {
				System.out.println("Comprobando si son octales..");
				Thread.sleep(2000);
				System.out.println("Ambos números son correctos, sumando...");
			} else {
				if (!esOctal(String.valueOf(n1))) {
					System.out.println("Error: El primer número no están en base octal");
					System.exit(-1);
				}
				if (!esOctal(String.valueOf(n2))) {
					System.out.println("Error: El segundo número no están en base octal");
					System.exit(-1);
				}
			}
		} while (n1 < 0 && n2 < 0);
		long n1rest = n1 / 8;
		long n2rest = n2 / 8;
		sum = n1rest + n2rest + (llevada ? 1 : 0);
		if (sum > 7) {
			sum = sum - 8;
			llevada = true;
		} else {
			llevada = false;
		}
		if (llevada)
			sum++;
		Thread.sleep(2000);
		System.out.println("La suma es " + sum + " ");
	}

	private static boolean esOctal(String octal) {
		String esOctal = octal;
		return esOctal.matches("^[0-7]+$");
	}
}
