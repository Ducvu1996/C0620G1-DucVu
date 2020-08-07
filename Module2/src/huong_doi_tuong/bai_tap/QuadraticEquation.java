package huong_doi_tuong.bai_tap;

public class QuadraticEquation {
	private int a,b,c;
	public QuadraticEquation() {
		
	}
	public QuadraticEquation(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	public int getC() {
		return this.c;
	}
	public int getDelta() {
		return b*b-4*a*c;
	}
	public void run() {
		if(this.getDelta()<0) {
			System.out.println("the equation has no root");
		}else if(this.getDelta()==0) {
			int x= this.b/2*this.a;
			System.out.println("the equation has a root :"+ x);
		}else if(this.getDelta()>0) {
			double x1= (-this.b-Math.sqrt(this.getDelta())) / 2*this.a;
			double x2= (-this.b+Math.sqrt(this.getDelta()))/2*this.a;
			System.out.println("the equation has a root :"+ x1+" and "+ x2);
		}
	}
	public static void main(String[] args) {
		QuadraticEquation quadraticEquation = new QuadraticEquation(1,3,2);
		quadraticEquation.run();
	}
}
