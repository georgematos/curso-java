package orientacao_objetos;

public class Rectangle {
	
	private double base;
	private double altura;
	
	public double getArea() {
		return base * altura;
	}

	public double getPerimetro() {
		return  base + base + altura + altura;
	}
	
	public double getDiagonal() {
		return Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));
	}
	
	public String toString() {
		return String.format("Area: %.2f\n"
				+ "Perímetro: %.2f\n"
				+ "Diagonal: %.2f\n", getArea(), getPerimetro(), getDiagonal());
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
