package generics.application;

public class Main {
	public static void main(String[] args) {

		PrintService<Integer> printNumbers = new PrintService<>();

		printNumbers.add(1);
		printNumbers.add(2);
		printNumbers.add(3);

		printNumbers.printQueue();

		PrintService<String> printStrings = new PrintService<>();

		printStrings.add("George");
		printStrings.add("Vanda");
		printStrings.add("José Maria");
		printStrings.add("Livia");
		printStrings.add("Daraline");

		printStrings.printQueue();

	}
}
