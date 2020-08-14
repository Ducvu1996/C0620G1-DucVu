package abstract_class_interface.bai_tap.resizeable;

public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
        Circle[] circles= new Circle[3];
       circles[0]=new Circle(4.5);
       circles[1]=new Circle(5,"blue",false);
       circles[2]=new Circle(4.5,"green",true);
       //circles[0].resize(30);
       for(Circle circle:circles) {
    	   circle.resize(Math.random()*100);
    	    System.out.println(circle);
       }
      
    }
}
