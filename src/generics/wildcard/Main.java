package generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		List<String> myStrings = Arrays.asList("oi", "ola", "alo");
		List<?> mixed = myInts;
		printListWild(mixed);
		mixed = myStrings;
		printListWild(mixed);
	}
	
	// o m�todo ir� trabalhar com um tipo especificado na cria��o da lista
	public static <T> void printListT(List<T> list) {
		for(T t : list) {
			System.out.println(t);
		}
	}
	
	public static void printListWild(List<?> list) { 
		for (Object obj : list) {
			System.out.println(obj);
		} 
	}
}
