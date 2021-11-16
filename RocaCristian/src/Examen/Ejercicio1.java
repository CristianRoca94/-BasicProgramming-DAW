package Examen;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String args[]) {

		String secuencia;

		secuencia = JOptionPane.showInputDialog("Introduce un número: ");

		if (es_saltarin(secuencia)) {
			JOptionPane.showMessageDialog(null, "Es un numero saltarín");
		} else {
			JOptionPane.showMessageDialog(null, "Es un numero normal");
		}

	}

	public static boolean es_saltarin(String s) {

		String cadena = s;
		boolean comprobado = false;
		int indice = 0;

		for (int i = 0; i <= cadena.length(); i++) {
			if (cadena.charAt(indice) == s.charAt(indice)) {
				comprobado = true;
			}
			indice = indice + cadena.charAt(indice) % cadena.length();
		}
		return comprobado;
	}
}
