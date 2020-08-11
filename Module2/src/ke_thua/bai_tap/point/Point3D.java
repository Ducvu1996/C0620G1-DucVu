package ke_thua.bai_tap.point;

public class Point3D extends Point2D {
	float z= 0.0f;
	Point3D(){
		
	}
	
	Point3D(float x, float y, float z){
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y, float z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public float[] getXYZ() {
		float[] array= {x,y,z};
		return array;
	}
	@Override
	public String toString() {
		return "we are pointing x= "+ getX() +" and y = "+getY()+" and z= "+getZ();
	}
}
