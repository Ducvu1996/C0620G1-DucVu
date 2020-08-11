package ke_thua.bai_tap.moveable_point;

public class MoveablePoint extends Point2D{
	float xSpeed = 0.0f; 
	float ySpeed= 0.0f;
	public MoveablePoint() {

	}

	public MoveablePoint(float x, float y,float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed= xSpeed;
		this.ySpeed= ySpeed;
		
	}
	
	public MoveablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed() {
		float[] array = {xSpeed,ySpeed};
		return array;
	}
	@Override
	public String toString() {
		return "we are pointing (x,y)= "+ getX()+"," +getY()+"speed="+getXSpeed()+","+getYSpeed();
	}
	public MoveablePoint  move() {
		x+=xSpeed;
		y+=ySpeed;
		return this;
	}
}
