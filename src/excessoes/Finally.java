package excessoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {

		File file = new File("D:\\teste.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
	}
}
