/*
 * Lendo um arquivo de forma simples
 * */
package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {

		File file = new File("D:\\Users\\georg\\eclipse-workspace\\curso-java\\src\\in.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archieve not found...");
		} finally {
			if (sc != null) {				
				sc.close();
			}
		}

	}

}
