package ke_thua.bai_tap.circle;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle cylinder = new Cylinder();
		System.out.println(circle);
		circle = new Circle(5.5,"yellow");
		System.out.println(circle);
		System.out.println(cylinder);
	}

}
