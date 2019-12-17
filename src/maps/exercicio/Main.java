package maps.exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> urnas = new HashMap<>();
		String path = "src\\votes.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] field = line.split(",");
				String nome = field[0];				
				int votos = Integer.parseInt(field[1]);
				
				if (urnas.containsKey(nome)) {
					int votosAnteriores = urnas.get(nome);
					urnas.put(nome, votosAnteriores+votos);
				} else {		
					urnas.put(nome, votos);
				}
				line = br.readLine();
			}
			
			for (String key : urnas.keySet()) {
				System.out.println(key + ":" + urnas.get(key));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
