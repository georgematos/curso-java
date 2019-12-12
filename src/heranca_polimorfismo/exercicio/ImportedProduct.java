package heranca_polimorfismo.exercicio;

public class ImportedProduct extends Product {

	private Double customsFee = 0.1;

	public ImportedProduct(String name, Double price) {
		super(name, price);
	}

	@Override
	public String priceTag() {

		price += price * customsFee;
		sb.append("Product name: " + name + "\n");
		sb.append("Product price: " + price + "\n");
		return sb.toString();

	}

}
