package orientacao_objetos;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo() {

	}
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.ladoA = lado1;
		this.ladoB = lado2;
		this.ladoC = lado3;
	}

	public double getArea() {
		
		double p = (ladoA + ladoB + ladoC) / 2;
		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
		
	}
	
	public static double getArea(double ladoA, double ladoB, double ladoC) {
		double p = (ladoA + ladoB + ladoC) / 2;
		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}
	
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

}
