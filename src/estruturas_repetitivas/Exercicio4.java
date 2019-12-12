package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		int current = 0;
		
		System.out.printf("Digite %d números:\n", n);
		
		for (int i = 0; i < n; i++) {
			current = sc.nextInt();
			if(current >= 10 && current <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.printf("%d in\n"
				+ "%d out\n", in, out);

		sc.close();
	}
}
