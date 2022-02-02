package app;

import java.io.FileReader;
import java.io.IOException;

public class AppThatReadAFileUsingFileReading {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("Archivo.txt");

		int i;
		
		while ((i = fr.read()) != -1) {
			System.out.print((char)i);
		}

	}
}
