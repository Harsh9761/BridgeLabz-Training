
class CircleDemo{
double radius;
	
	public CircleDemo() {
		this.radius = 1.0;
	}
	public CircleDemo(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
	
	
	public void display() {
		System.out.println("Radius is: "+radius);
		System.out.println("Area of Circle is: "+findArea());
		
	}
}

public class Circle {

	public static void main(String[] args) {
		CircleDemo circle1 = new CircleDemo();
		circle1.display();
		
		CircleDemo circle2 = new CircleDemo(50);
		circle2.display();

	}

}
