package classes_abstratas.exercicio;

public class PessoaJuridica extends Pessoa {

	public Integer numeroDeFuncionarios;
	
	public PessoaJuridica(String nome, Double renda, Integer numeroDeFuncionarios) {
		super(nome, renda);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double getImposto() {
		if (numeroDeFuncionarios > 10) {
			return renda * 0.14;
		} else {
			return renda * 0.16;
		}
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
}
