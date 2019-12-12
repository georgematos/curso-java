package orientacao_objetos_2;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1000, "George Matos", 500);
		
		conta.depositar(200.00);
		System.out.println("Saldo: " + conta.getSaldo());
		
		conta.sacar(300);
		System.out.println("Saldo: " + conta.getSaldo());
		
		if (conta.getSaldo() == 395.00) {
			System.out.println("Test OK");
		} else {
			System.out.println("Test fail");
		}
		
	}
	
}
