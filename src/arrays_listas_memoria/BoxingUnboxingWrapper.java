package arrays_listas_memoria;

import java.util.Locale;

public class BoxingUnboxingWrapper {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		x = 10;

		System.out.println(obj);
		
		Integer i = 8;
		
		System.out.println(i);
		System.out.println(Integer.sum(4, i));
		
	}

}
