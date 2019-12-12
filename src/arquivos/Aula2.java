package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula2 {

	public static void main(String[] args) {

		String path = "D:\\Users\\georg\\eclipse-workspace\\curso_programacao\\src\\in.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {			
			fr = new FileReader(path);
			br = new BufferedReader(new FileReader(path));

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}
}
