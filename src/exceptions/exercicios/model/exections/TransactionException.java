package exceptions.exercicios.model.exections;

public class TransactionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TransactionException(String msg) {
		super(msg);
	}

}
