package huong_doi_tuong.bai_tap;


public class Fan {
	final int SLOW =1;
	final int MEDIUM =2;
	final int FAST =3;
	private int speed = SLOW;
	private boolean on= false;
	private double radius=5;
	private String color= "blue";
	Fan(){
		
	}
	// speed
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	//
	public boolean getOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on=on;
	}
	//
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	//
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		if(this.getOn()!=false) {
			return "speed:"+this.speed+"\t color:"+this.color+"\t radius:"+this.radius+ "\t fan is on";
		}else {
		return "color:"+this.color+"\t radius:"+this.radius+ "\t fan is off";
		}
	}
	
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setOn(true);
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		System.out.println(fan1.toString());
		Fan fan2 = new Fan();
		fan2.setOn(false);
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		System.out.println(fan2.toString());
	}

}
