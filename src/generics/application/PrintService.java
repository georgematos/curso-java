package generics.application;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> queue = new ArrayList<>();

	public void add(T t) {
		queue.add(t);
	}

	public void printQueue() {
		for (T t : queue) {
			System.out.println(t);
		}
	}

}
