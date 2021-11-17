package Examen;

import java.util.Arrays;

import javax.swing.JOptionPane;


public class Ejercicio3 {

	public static void main(String args[]) {

		int dimension = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce la dimension de la matriz a comprobar: "));
		int[][] matriz = new int[dimension][dimension];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el elemento [" + x + "," + y + "]"));
			}
		}
		int[][] matrizsubT = Traspuesta(matriz);
		if (equals(matriz, matrizsubT)) {
			JOptionPane.showMessageDialog(null, "La matriz es simetrica");
		} else {
			JOptionPane.showMessageDialog(null, "La matriz NO es simetrica");
		}

	}

	// Metodo para conseguir la matriz traspuesta
	public static int[][] Traspuesta(int[][] matriz) {

		int[][] matrizsubT = new int[matriz[0].length][matriz.length];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matrizsubT[y][x] = matriz[x][y];
			}
		}
		return matrizsubT;
	}

	// Metodo para comprobar dos matrices
	public static boolean equals(int[][] m1, int[][] m2) {
		if (Arrays.deepEquals(m1, m2))
			return true;
		else
			return false;
	}

}
