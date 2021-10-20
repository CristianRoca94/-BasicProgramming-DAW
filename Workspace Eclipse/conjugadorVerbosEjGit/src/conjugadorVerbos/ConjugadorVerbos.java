package conjugadorVerbosEjGit;

import java.util.Scanner;

public class ConjugadorVerbos {
	

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String linea = scan.nextLine();
			String lineaArray[] = linea.split(" ");
			String verbo = lineaArray[0];
			String tiempoVerbal = lineaArray[1];
			String array[] = { "Yo", "Tu", "El", "Nosotros", "Vosotros", "Ellos" };

			int num;

			while (tiempoVerbal != "T") {
				num = tipo(verbo);
				conjugar(num, verbo, tiempoVerbal, array);
				linea = scan.nextLine();
				lineaArray = linea.split(" ");
				verbo = lineaArray[0];
				tiempoVerbal = lineaArray[1];
			}

		}

		// Probar tipo de verbo
		public static int tipo(String verbo) {
			if (verbo.endsWith("ar")) {
				return 1;
			} else if (verbo.endsWith("er")) {
				return 2;
			} else if (verbo.endsWith("ir")) {
				return 3;
			} else
				return -1;
		}

		public static void conjugar(int tipo, String verbo, String tiempoVerbal, String array[]) {
			String verbito = verbo.substring(0, verbo.length() - 2);
			switch (tipo) {
			case 1:
				switch (tiempoVerbal) {
				case "A":
					System.out.println(array[0] + " " + verbito + "o");
					System.out.println(array[1] + " " + verbito + "as");
					System.out.println(array[2] + " " + verbito + "a");
					System.out.println(array[3] + " " + verbito + "amos");
					System.out.println(array[4] + " " + verbito + "ais");
					System.out.println(array[5] + " " + verbito + "an");
					break;
				case "P":
					System.out.println(array[0] + " " + verbito + "e");
					System.out.println(array[1] + " " + verbito + "aste");
					System.out.println(array[2] + " " + verbito + "o");
					System.out.println(array[3] + " " + verbito + "amos");
					System.out.println(array[4] + " " + verbito + "eis");
					System.out.println(array[5] + " " + verbito + "aron");
					break;
				case "F":
					System.out.println(array[0] + " " + verbito + "are");
					System.out.println(array[1] + " " + verbito + "aras");
					System.out.println(array[2] + " " + verbito + "ara");
					System.out.println(array[3] + " " + verbito + "aremos");
					System.out.println(array[4] + " " + verbito + "areis");
					System.out.println(array[5] + " " + verbito + "aran");
					break;
				default:
					break;
				}
				break;
			case 2:
				switch (tiempoVerbal) {
				case "A":
					System.out.println(array[0] + " " + verbito + "o");
					System.out.println(array[1] + " " + verbito + "es");
					System.out.println(array[2] + " " + verbito + "e");
					System.out.println(array[3] + " " + verbito + "emos");
					System.out.println(array[4] + " " + verbito + "eis");
					System.out.println(array[5] + " " + verbito + "en");
					break;
				case "P":
					System.out.println(array[0] + " " + verbito + "i");
					System.out.println(array[1] + " " + verbito + "iste");
					System.out.println(array[2] + " " + verbito + "io");
					System.out.println(array[3] + " " + verbito + "imos");
					System.out.println(array[4] + " " + verbito + "isteis");
					System.out.println(array[5] + " " + verbito + "ieron");
					break;
				case "F":
					System.out.println(array[0] + " " + verbito + "ere");
					System.out.println(array[1] + " " + verbito + "eras");
					System.out.println(array[2] + " " + verbito + "era");
					System.out.println(array[3] + " " + verbito + "eremos");
					System.out.println(array[4] + " " + verbito + "ereis");
					System.out.println(array[5] + " " + verbito + "eran");
					break;
				default:
					break;
				}
				break;
			case 3:
				switch (tiempoVerbal) {
				case "A":
					System.out.println(array[0] + " " + verbito + "o");
					System.out.println(array[1] + " " + verbito + "es");
					System.out.println(array[2] + " " + verbito + "e");
					System.out.println(array[3] + " " + verbito + "imos");
					System.out.println(array[4] + " " + verbito + "is");
					System.out.println(array[5] + " " + verbito + "en");
					break;
				case "P":
					System.out.println(array[0] + " " + verbito + "i");
					System.out.println(array[1] + " " + verbito + "iste");
					System.out.println(array[2] + " " + verbito + "io");
					System.out.println(array[3] + " " + verbito + "imos");
					System.out.println(array[4] + " " + verbito + "isteis");
					System.out.println(array[5] + " " + verbito + "ieron");
					break;
				case "F":
					System.out.println(array[0] + " " + verbito + "ire");
					System.out.println(array[1] + " " + verbito + "iras");
					System.out.println(array[2] + " " + verbito + "ira");
					System.out.println(array[3] + " " + verbito + "iremos");
					System.out.println(array[4] + " " + verbito + "ireis");
					System.out.println(array[5] + " " + verbito + "iran");
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
		}
		
	/*
	 * //Metodo privado para comprobar si el verbo introducido es un verbo regular
	 * private boolean comprobarRegular(String verbo, ArrayList<String> listaVerbos)
	 * {
	 * 
	 * int contador = 0; boolean encontrado =false;:
	 * 
	 * while (listaVerbos.size()) > contador && encontrado) { if
	 * (listaVerbos.get(contador) == verbo) { encontrado = true; } } return
	 * encontrado; }
	 * 
	 * 
	 * //Metodo privado para pasar los datos del fichero txt con los verbos
	 * regulares en un ArrayList private void cargarListaVerbos(){ ArrayList<String>
	 * listaVerbos = new ArrayList <String>(); FileReader fr = null; BufferedReader
	 * br; File fichero= new File ("verbosregulares.txt");
	 * 
	 * try { fr = new FileReader(fichero); br = new BufferedReader(fr);
	 * 
	 * String linea; while ((linea = br.readLine()) != null) {
	 * listaVerbos.add(linea); } } catch (IOException e) {
	 * e.printStackTrace(System.out); } finally { try { if (fr != null) {
	 * fr.close(); } } catch (IOException e2) { e2.printStackTrace(System.out); } }
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
}
