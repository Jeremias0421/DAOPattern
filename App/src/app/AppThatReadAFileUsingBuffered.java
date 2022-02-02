package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppThatReadAFileUsingBuffered {

	public static void main(String[] args) throws IOException {
		/*Creo un objeto file que representa la abstraccion de un archivo*/
		File archivo = new File("Archivo.txt");

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		String st;

		while ((st = br.readLine()) != null)

			System.out.println(st);
	}

}
