package ke_thua.bai_tap.circle;

public class Cylinder extends Circle{
	private double height = 4.0;
	
    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.radius = radius;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }
    
    public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getCapacity() {
    	return super.getArea()*this.getHeight();
    } 
	@Override
	public String toString() {
	      return "A Cylinder with radius="
	                + getRadius()
	                + "and height"
	                +getHeight()
	                +"and color:"+
	                getColor();	                
	}
}
