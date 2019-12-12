package classes_abstratas.exercicio;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new PessoaFisica("Alex", 50000.0, 2000.0));
		pessoas.add(new PessoaFisica("George", 120000.0, 1000.0));
		pessoas.add(new PessoaJuridica("SoftTeck", 400000.0, 25));
		pessoas.add(new PessoaJuridica("McMicro", 200000.0, 5));

		for (Pessoa p : pessoas) {
			System.out.printf("%s: $ %.2f\n", p.getNome(), p.getImposto());
		}
		
		double taxas = 0.0;
		for (Pessoa p : pessoas) {
			taxas += p.getImposto();
		}
		
		System.out.println("Total de taxas: " + taxas);
	}
	
}
