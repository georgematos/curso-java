package heranca_polimorfismo.exercicio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {

		sb.append("Product name: " + name + "\n");
		sb.append("Product price: " + price + "\n");
		sb.append("Manufacture Date: " + sdf.format(manufactureDate) + "\n");
		return sb.toString();

	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

}
