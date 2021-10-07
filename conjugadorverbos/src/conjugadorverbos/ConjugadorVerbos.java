package conjugadorverbos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConjugadorVerbos {

	
	
	//Metodo privado para comprobar si el verbo introducido es un verbo regular
	private boolean comprobarRegular(String verbo, ArrayList<String> listaVerbos) {

		int contador = 0;
		boolean encontrado = false;

		while (listaVerbos.size() > contador && encontrado) {
			if (listaVerbos.get(contador) == verbo) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	
	//Metodo privado para pasar los datos del fichero txt con los verbos regulares en un ArrayList
	private void cargarListaVerbos(){
    ArrayList<String> listaVerbos = new ArrayList <String>();
    FileReader fr = null;
    BufferedReader br;
    File fichero= new File ("verbosregulares.txt");
 
    try {
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
 
        String linea;
        while ((linea = br.readLine()) != null) {
            listaVerbos.add(linea);
        }
    } catch (IOException e) {
        e.printStackTrace(System.out);
    } finally {
        try {
            if (fr != null) {
                fr.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace(System.out);
        }
    }
    
}


}
