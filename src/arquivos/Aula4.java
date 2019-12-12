package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula4 {
	public static void main(String[] args) {
		// new FileWriter(path) - Cria um arquivo novo ou sobrescreve um existente
		// new FileWriter(path, true) - Abre um arquivo existente para edição
		String[] lines = new String[] { "Java", "Kotlin", "Python" };

		String path = "D:\\Users\\georg\\eclipse-workspace\\curso_programacao\\src\\in2.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.newLine();
				bw.write(line);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
