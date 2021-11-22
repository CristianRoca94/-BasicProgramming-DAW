package math;

import javax.swing.JOptionPane;

public class GaussMethod {

	static int numberOfVariables;
	static String sal = "";
	double d;
	double p;
	static float matrix[][];

	public static void main(String args[]) {
		matrixConstructor();
		jordan();
	}

	public static void matrixConstructor() {

		numberOfVariables = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce el n�mero de variables (m�n. 3 - m�x. 10): "));
		matrix = new float[numberOfVariables][numberOfVariables + 1];
		for (int i = 0; i < numberOfVariables; i++) {
			for (int j = 0; j < numberOfVariables + 1; j++) {
				String coefficient = "Introduce el elemento : " + i + " " + j;
				matrix[i][j] = Float.parseFloat(JOptionPane.showInputDialog(coefficient));

			}
		}

	}

	static void pivote(float matriz[][], int piv, int var) {
		float temp = 0;
		temp = matriz[piv][piv];
		for (int y = 0; y < (var + 1); y++) {

			matriz[piv][y] = matriz[piv][y] / temp;
		}
	}

	static void hacerceros(float matriz[][], int piv, int var) {
		for (int x = 0; x < var; x++) {
			if (x != piv) {
				float c = matriz[x][piv];
				for (int z = 0; z < (var + 1); z++) {
					matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
				}
			}
		}
	}

	static void muestramatriz(float matriz[][], int var) {
		for (int x = 0; x < var; x++) {
			for (int y = 0; y < (var + 1); y++) {
				// sal+= " " + matriz[x][y] + " |";
				System.out.print(" " + matriz[x][y] + " |");
			}

			System.out.println("");
			// JOptionPane.showMessageDialog(null,sal,"GAUSS-JORDAN",JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void jordan() {
		int piv = 0;

		for (int a = 0; a < numberOfVariables; a++) {
			pivote(matrix, piv, numberOfVariables);

			System.out.println("\tRenglon " + (a + 1) + " entre el pivote");
			muestramatriz(matrix, numberOfVariables);

			System.out.println("");

			System.out.println("\tHaciendo ceros");
			hacerceros(matrix, piv, numberOfVariables);

			muestramatriz(matrix, numberOfVariables);
			System.out.println("");
			piv++;
		}
		for (int x = 0; x < numberOfVariables; x++) {
			// System.out.println("La variable X" + (x + 1) + " es: " + matrix[x][var]);
			sal += "La variable X" + (x + 1) + " es: " + matrix[x][numberOfVariables] + "\n";
		}

		JOptionPane.showMessageDialog(null, sal, "M�todo de Gauss", JOptionPane.ERROR_MESSAGE);

	}

}
