package lambda_entities;

public class Product {

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Predicado: m�todo trabalha com argumento passado
	public static boolean productPredicate(Product p) {
		return p.getPrice() >= 100;
	}

	// Predicado: m�todo trabalha com os atributos da pr�pria classe
	public boolean nonStaticProductPredicate() {
		return this.getPrice() >= 100;
	}

	// Predicado: m�todo trabalha com argumento passado
	public static void productConsumer(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	// Predicado: m�todo trabalha com os atributos da pr�pria classe
	public void nonStaticProductConsumer() {
		this.setPrice(this.getPrice() * 1.1);
	}

	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	public String nonStaticUpperCaseName() {
		return this.getName().toUpperCase(); 
	}
	
	@Override
	public String toString() {
		return "Product [name: " + name + ", price: " + String.format("%.2f]", price);
	}
}
