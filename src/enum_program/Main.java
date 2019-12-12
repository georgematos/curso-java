package enum_program;

import java.util.Date;

import enum_entities.Order;
import enum_enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDIGN_PAYMENT);
		
		System.out.println(order);
		
	}
	
}
