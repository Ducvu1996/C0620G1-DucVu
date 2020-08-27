package xu_ly_ngoai_le.bai_tap.triangle_exception;


public class Triangle {
	   public Triangle(int side1, int side2, int side3) throws IllegalTriangleException {
	        if ( side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
	            throw new IllegalTriangleException("Tam giác không hợp lệ !");
	        else throw new IllegalTriangleException("Tam giác hợp lệ !");
	    }	
}
