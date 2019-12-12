package estrutura_sequencial;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Olá mundo!");
		System.out.print("Bom dia,");
		System.out.println(" meu amigo programador!");
		
		int y = 32;
		double x = 10.43593;
		System.out.println(y);
		
		// Formatação da saída
		System.out.printf("%.2f\n", x); // \n no final, quebra a linha
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf(
				"Nome: %s\n" +
				"Idade: %d\n" +
				"Renda: %.2f\n", nome, idade, renda
		);
		
	}

}
