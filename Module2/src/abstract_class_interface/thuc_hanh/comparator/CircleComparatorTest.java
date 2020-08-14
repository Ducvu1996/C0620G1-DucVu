package abstract_class_interface.thuc_hanh.comparator;

import java.util.Arrays;
import java.util.Comparator;

import ke_thua.thuc_hanh.shape.Circle;
import ke_thua.thuc_hanh.shape.Rectangle;

public class CircleComparatorTest {
	 public static void main(String[] args) {
	        Circle[] circles = new Circle[3];
	        circles[0] = new Circle(3.6);
	        circles[1] = new Circle();
	        circles[2] = new Circle(3.5, "indigo", false);

	        System.out.println("Pre-sorted:");
	        for (Circle circle : circles) {
	            System.out.println(circle);
	        }

	        Comparator circleComparator =(Comparator) new CircleComparator();
	        Arrays.sort(circles, circleComparator);

	        System.out.println("After-sorted:");
	        for (Circle circle : circles) {
	            System.out.println(circle);
	        }
	        //
	        Rectangle[] rectangle = new Rectangle[3];
	        rectangle[0] = new Rectangle();
	        rectangle[1] = new Rectangle(0.5,6,"blue",true);
	        rectangle[2] = new Rectangle(1,4);
	        System.out.println("Pre-sorted:");
	        for (Rectangle rectangles : rectangle) {
	            System.out.println(rectangles);
	        }
	        Comparator rectangleComparator =(Comparator) new Retangle();
	        Arrays.sort(rectangle, rectangleComparator);
	        
	        System.out.println("After-sorted:");
	        for (Rectangle rectangles : rectangle) {
	            System.out.println(rectangles);
	        }
	    }
}
