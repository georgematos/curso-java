package enum_entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import enum_enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String data = sdf.format(moment);
		return String.format("Status do pedido:\n"
				+ "ID: %d\n"
				+ "Instant order: %s\n"
				+ "Status: %s", id, data, status);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
}
