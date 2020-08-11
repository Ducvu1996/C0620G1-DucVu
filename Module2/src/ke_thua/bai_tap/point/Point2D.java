package ke_thua.bai_tap.point;

public class Point2D {
	float x =0.0f;
	float y =0.0f;
	Point2D(){
		
	}
	Point2D(float x, float y){
		this.x =x;
		this.y=y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public float[] getXY() {
	 float[] array= {x,y};
		return array;
	} 
	@Override
	public String toString() {
		return "we are pointing x= "+ getX() +" and y= "+getY();
	}
}
