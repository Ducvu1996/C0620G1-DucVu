package abstract_class_interface.bai_tap.colorable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];
		shapes[0]= new Circle();
		shapes[1]= new Square();
		shapes[2]= new Rectangle();
		for(Shape shape:shapes) {
			if(shape instanceof Colorable) {
				((Colorable) shape).howToColor();
			
			}else {
				System.out.print("");
			}
			
			System.out.println(shape);
		}
	
	}

}
