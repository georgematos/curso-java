package orientacao_objetos_2;

public class Conta {

	private int numero;
	private String usuario;
	private double saldo;
	private final double TAXA = 5.0f;
	
	public Conta(int numero, String usuario) {
		this.numero = numero;
		this.usuario = usuario;
	}
	
	public Conta(int numero, String usuario, double saldo) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		this.saldo = (this.saldo - saque) - TAXA;
	}
	
	public String toString() {
		return String.format("Dados da conta:\n"
				+ "Conta: %d\n"
				+ "Usuário: %s\n"
				+ "Saldo: %.2f\n", this.numero, this.usuario, this.saldo);
	}
	
	
	
	public double getSaldo() {return saldo;}
	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}
	public String getUsuario() {return usuario;}
	public void setUsuario(String usuario) {this.usuario = usuario;}

}
