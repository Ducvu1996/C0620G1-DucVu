package abstract_class_interface.bai_tap.resizeable;
public class SquareTest {
    public static void main(String[] args) {
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);
//        
    	Square[] squares= new Square[3];
    	squares[0]=new Square();
    	squares[1]=new Square(5);
    	squares[2]=new Square(7,"blue",true);
        //circles[0].resize(30);
        for(Square square:squares) {
        	square.resize(Math.random()*100);
     	    System.out.println(square);
        }
         
    }
}
