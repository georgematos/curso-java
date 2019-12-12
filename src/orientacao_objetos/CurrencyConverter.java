package orientacao_objetos;

public final class CurrencyConverter {
	
	private static double iof = 0.06f;
	
	public static double toConvert(double real, double dollar) {
		double imposto = (real * dollar) * iof;
		return real * dollar + imposto;
	}
	
}
