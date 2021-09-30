import java.util.Scanner;

/**
 * Ejercicio con un recorrido for
 * 
 * @param un numero entero
 * @Autor Cristian Roca Flores
 */
public class EjercicioRecorrido {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
//		izquierda(num);
		derecha(num);
//		piramide(num);
//		piramideinverso(num);
	}

	public static void izquierda(int n) {

		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 0; j < i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

	public static void derecha(int n) {

		int m = n;

		char matriz[][] = new char[n][m];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if ((i + j) >= matriz.length && (j - i) <= matriz.length) {
					matriz[i][j] = '*';
				} else {
					matriz[i][j] = ' ';
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void piramide(int n) {

		int m = n;

		char matriz[][] = new char[n][m];

		int mitad = matriz[0].length / 2;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if ((i + j) >= mitad && (j - i) <= mitad) {
					matriz[i][j] = '*';
				} else {
					matriz[i][j] = ' ';
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void piramideinverso(int n) {

		int i, j;
		for (i = n; i > 1; i--) {
			for (j = 0; j < i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
