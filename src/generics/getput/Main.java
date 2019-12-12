package generics.getput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<? extends Number> myInts = Arrays.asList(1, 2, 3, 4);
		List<? extends Number> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		copy(myDoubles, myObjs);
		
		for (Object o : myObjs) {
			System.out.println(o);
		}
	}
	
	public static void copy(List<? extends Number> sourceList, List<? super Number> destinyList) {
		
		destinyList.addAll(sourceList);
	}
}
