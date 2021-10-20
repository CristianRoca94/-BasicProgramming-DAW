
import java.util.ArrayList;
import java.util.List;

public class ConjugadorVerbos {
	public static void main(String[] args) {
		ArrayList<String> Persona = new ArrayList<String>();
		List<ArrayList<String>> Terminaciones = new ArrayList<>();
		ArrayList<String> Pasado = new ArrayList<String>();
		ArrayList<String> Presente = new ArrayList<String>();
		ArrayList<String> Futuro = new ArrayList<String>();

		// Añadiendo las personas
		Persona.add("Yo");
		Persona.add("Tu");
		Persona.add("El");
		Persona.add("Nosotros");
		Persona.add("Vosotros");
		Persona.add("Ellos");

		// Añadiendo las declinaciones de cada tiempo verbal
		Pasado.add("é");
		Pasado.add("aste");
		Pasado.add("ó");
		Pasado.add("amos");
		Pasado.add("asteis");
		Pasado.add("aron");
		Presente.add("o");
		Presente.add("as");
		Presente.add("a");
		Presente.add("amos");
		Presente.add("áis");
		Presente.add("an");
		Futuro.add("aré");
		Futuro.add("arás");
		Futuro.add("ará");
		Futuro.add("aremos");
		Futuro.add("aréis");
		Futuro.add("arán");

		// Añadiendo los arrays en la lista de arrays
		Terminaciones.add(Pasado);
		Terminaciones.add(Presente);
		Terminaciones.add(Futuro);

		
	}

	// ---------------------------------------------------------------- Metodos privados ----------------------------------------------------------------
	private static boolean comprobarVerbo(String s) {

		boolean check = true;
		if (s.charAt(s.length() - 1) != 'r') {
			check = false;
		}

		return check;
	}

}