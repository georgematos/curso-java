package sets.demo1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		// HashSet � o mais indicado se a ordem dos elementos n�o importa. 
		// TreeSet ordena os elementos baseando-se no m�todo compareTo do objeto, caso n�o exista o m�todo, usar� a posi��o na mem�ria para comparar
		// LinkedHashSet, mant�m a ordem dos elementos, � mais lento que o HashSet, por�m, mais r�pido que o TreeSet
		
		Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}

	}
}
