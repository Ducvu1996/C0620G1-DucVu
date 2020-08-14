package abstract_class_interface.bai_tap.resizeable;
public class RectangleTest {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//        
    	Rectangle[] rectangles= new Rectangle[3];
    	rectangles[0]=new Rectangle();
    	rectangles[1]=new Rectangle(5,6);
    	rectangles[2]=new Rectangle(7,8,"green",true);
        //circles[0].resize(30);
        for(Rectangle rectangle:rectangles) {
        	rectangle.resize(Math.random()*100);
     	    System.out.println(rectangle);
        }
         
    }
}
