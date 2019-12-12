package heranca_polimorfismo.exercicio;

public class Product {

	protected String name;
	protected Double price;
	protected StringBuilder sb = new StringBuilder();

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {
		sb.append("Product name: " + name + "\n");
		sb.append("Product price: " + price + "\n");
		return sb.toString();
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

}
