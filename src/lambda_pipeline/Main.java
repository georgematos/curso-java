package lambda_pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		List<Integer> modifiedList = list.stream().map(x -> x * 10).collect(Collectors.toList());
		System.out.println(modifiedList);
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma: " + sum);
		
		List<Integer> newList = Arrays.asList(3, 4, 5, 10, 7);
		
		List<Integer> resultList = newList.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		
		System.out.println(resultList);
	}
	
}
