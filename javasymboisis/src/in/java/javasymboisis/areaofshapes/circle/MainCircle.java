package in.java.javasymboisis.areaofshapes.circle;

public class MainCircle {
	public static void main(String[] args) {
		Circle obj=new Circle();
		System.out.println("Area of circle:"+obj.calculateArea());
		System.out.println("CIrcle circumference:"+obj.calculateCircumference());
		Circle obj1=new Circle(10);
		System.out.println("Area of circle:"+obj1.calculateArea());
		System.out.println("CIrcle circumference:"+obj1.calculateCircumference());
		
	}

}
class Circle{
	float radius;
	public Circle(){
		radius=2;
	}
	public Circle(float radius) {
		this.radius=radius;
	}
	public float calculateArea() {
		return 3.14F*radius*radius;
	}
	public float calculateCircumference() {
		return 2*3.14F*radius;
	}
}
