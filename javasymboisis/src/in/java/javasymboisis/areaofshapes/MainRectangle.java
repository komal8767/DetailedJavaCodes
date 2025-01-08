package in.java.javasymboisis.areaofshapes;

public class MainRectangle {
	public static void main(String[] args) {
		Rectangle object=new Rectangle();
		System.out.println("Area of rectangle:"+object.printRectangleArea());
		Rectangle object1=new Rectangle(5.6F,6.0F);
		System.out.println("Area of rectangle:"+object1.printRectangleArea());
		object1.setLength(2.23F);
		//object1.setLength((float)2.23);
		object1.setWidth(8.2F);
		System.out.println("Length:"+object1.getLength());
		System.out.println("Width:"+object1.getWidth());
		System.out.println("Area of rectangle:"+object1.printRectangleArea());
		
		
	}

}
//class Rectangle{
//	float length;
//	float width;
//	//float area;
//	public Rectangle() {
//		length=2F;
//		width=3F;
//	}
//	public Rectangle(float length, float width) {
//		this.length=length;
//		this.width=width;
//	}
//	public void setLength(float length) {
//		this.length=length;
//	}
//	public void setWidth(float width) {
//		this.width=width;
//	}
//	public float getLength() {
//		return length;
//	}
//	public float getWidth() {
//		return width;
//	}
//	public float printRectangleArea() {
////		area=length*width;
////		System.out.println("Area of Rectangle:"+area);
//		return length*width;
//	}
//	
//}
