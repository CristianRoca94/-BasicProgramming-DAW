import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String secuencia;
		String seguir = "S";
		boolean centinela;
		int numero,totalPrimos = 0;

		while (seguir == "S" || seguir == "s") {
			do {
				System.out.println("Introduce los numeros: ");
				secuencia = teclado.nextLine();
				centinela = secuencia.equals("fin");
				
				if (!centinela) {
					numero= Integer.parseInt(secuencia);
					if (esPrimo(numero)) {
					totalPrimos++;
					}
				}
				
			} while (!centinela);
			
			System.out.println("Hay " + totalPrimos + " numeros primos en esta cadena");
			System.out.println("Deseas seguir? S/N: ");
			seguir = teclado.nextLine();
		}

		teclado.close();
	}

	public static boolean esPrimo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		return true;
	}
}
