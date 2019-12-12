package interfaces.comparable.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Funcionario> listNames = new ArrayList<>();
		String filePath = "src\\nomes.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] funcFields = line.split(",");
				listNames.add(new Funcionario(funcFields[0], Double.parseDouble(funcFields[1])));
				line = br.readLine();
			}
			
			Collections.sort(listNames);
			
			for (Funcionario func : listNames) {
				System.out.println(func.getNome() + "\t$ " + func.getSalario());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found or does not exists");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
