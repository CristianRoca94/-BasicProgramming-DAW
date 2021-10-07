import java.util.Scanner;

public class Cadena1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una línea: ");
		String cadena = new String(teclado.nextLine());
		System.out.println("Introduce una letra: ");
		String letra = new String(teclado.nextLine());
		teclado.close();
		int i,contador = 0; 
		for (i) {
			
			if (cadena.charAt(i)==" " && cadena.charAt(i)==letra) {
				contador++;
			}
			i++;

		}

		System.out.println(contador + " palabras comienzan con la letra <<" + letra + ">>");

	}
}
