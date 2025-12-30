import java.util.*;
public class Circle {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
	public double findCircumference() {
		return 2*Math.PI*radius;
	}
	
	public void display() {
		System.out.println("Radius is: "+radius);
		System.out.println("Area of Circle is: "+findArea());
		System.out.println("Circumference of Circle: "+findCircumference());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		Circle circle = new Circle(radius);
		
		circle.display();
		
	}

}
