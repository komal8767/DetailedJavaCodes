package in.java.javasymboisis.areaofshapes;

class Rectangle{
	float length;
	float width;
	//float area;
	public Rectangle() {
		length=2F;
		width=3F;
	}
	public Rectangle(float length, float width) {
		this.length=length;
		this.width=width;
	}
	public void setLength(float length) {
		this.length=length;
	}
	public void setWidth(float width) {
		this.width=width;
	}
	public float getLength() {
		return length;
	}
	public float getWidth() {
		return width;
	}
	public float printRectangleArea() {
//		area=length*width;
//		System.out.println("Area of Rectangle:"+area);
		return length*width;
	}
	
}

