package app2;

import java.io.IOException;

public class Ejecutar {

	public static void main(String[] args) {
		try {
			AplicacionParaLeer.leerArchivo("Archivo.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
