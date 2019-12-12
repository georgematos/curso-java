package classes_abstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import classes_abstratas.metodos.Circle;
import classes_abstratas.metodos.Color;
import classes_abstratas.metodos.Rectangle;
import classes_abstratas.metodos.Shape;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Rectangle rectangle1 = new Rectangle(Color.BLUE, 20.0, 10.0);
		Rectangle rectangle2 = new Rectangle(Color.RED, 30.0, 15.0);
		Circle circle1 = new Circle(Color.GREEN, 20.0);
		Circle circle2 = new Circle(Color.BLUE, 25.0);
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(circle1);
		shapes.add(circle2);
		shapes.add(rectangle1);
		shapes.add(rectangle2);
		
		for (Shape s : shapes) {
			if (s instanceof Rectangle) {
				System.out.printf("Rectangle Area: %.2f\n", s.area());
			} else {
				System.out.printf("Circle Area: %.2f\n", s.area());
			}
		}
		
	}

}
