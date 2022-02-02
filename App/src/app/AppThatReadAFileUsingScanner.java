package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppThatReadAFileUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("Archivo.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}
