package generics.generic.delimited;

import java.util.List;

public class CalculationService<T> {

	public static <T extends Comparable<? super T>> T max(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		T max = list.get(0);

		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}

		return max;

	}
	
	public static <T extends Comparable<T>> T min(List<T> list) { // qual a diferença de implementar assim?
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		T min = list.get(0);
		
		for (T item : list) {
			if (item.compareTo(min) < 0) {
				min = item;
			}
		}

		return min;
		
	}

}
