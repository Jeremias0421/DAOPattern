package app2;

import java.io.FileReader;
import java.io.IOException;

public class AplicacionParaLeer {

	public static void leerArchivo(String ruta) throws IOException{
		FileReader fr = new FileReader(ruta);
		int i;

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
