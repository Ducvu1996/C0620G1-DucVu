package ke_thua.bai_tap.circle;

public class Circle {
	 double radius = 3.0; ;
	 String color="blue";
	 Circle(){
		 
	 }
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	@Override
	public String toString() {
	      return "A Circle with radius="
	                + getRadius()+
	                "and color:"+
	                getColor();
	              
	}
}
