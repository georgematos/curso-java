package classes_abstratas.exercicio;

public class PessoaFisica extends Pessoa {

	private Double gastosComSaude;

	public PessoaFisica(String nome, Double renda, Double gastosComSaude) {
		super(nome, renda);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double getImposto() {
		double imposto = 0.0;
		double abatimento = 0.0;
		if (renda < 20000.0) {
			abatimento = gastosComSaude * 0.5;
			imposto = renda * 0.15;
			return imposto - abatimento;
		} else {
			abatimento = gastosComSaude * 0.5;
			imposto = renda * 0.25;
			return imposto - abatimento;
		}
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

}
