package ke_thua.bai_tap.moveable_point;

public class Main {

	public static void main(String[] args) {
		Point2D point2D = new Point2D();
		MoveablePoint moveablePoint = new MoveablePoint(1,2,3,5);
		System.out.println(moveablePoint.move());
	}

}
