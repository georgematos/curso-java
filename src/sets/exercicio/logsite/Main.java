package sets.exercicio.logsite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		String path = "src\\logsite.txt";
		
		try (BufferedReader bfreader = new BufferedReader(new FileReader(path))) {
			
			String line = bfreader.readLine();
			Set<String> users = new HashSet<String>();
			
			while (line != null) {
				
				String[] field = line.split(" ");
				users.add(field[0]);
				line = bfreader.readLine();
			}
			
			System.out.printf("%d users have access the site.", users.size());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
