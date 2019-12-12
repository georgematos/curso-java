package sets.demo1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		// HashSet é o mais indicado se a ordem dos elementos não importa. 
		// TreeSet ordena os elementos baseando-se no método compareTo do objeto, caso não exista o método, usará a posição na memória para comparar
		// LinkedHashSet, mantém a ordem dos elementos, é mais lento que o HashSet, porém, mais rápido que o TreeSet
		
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
