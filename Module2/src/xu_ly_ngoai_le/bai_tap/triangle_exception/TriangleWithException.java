package xu_ly_ngoai_le.bai_tap.triangle_exception;

public class TriangleWithException {
 private double perimeter;
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = -1.0;

    //Number of objects created
    private static int numberOfObjects = 0;

        //construct a triangle with perimeter 
    public TriangleWithException(double side1, double side2, double side3)  {

    }
    //Construct a triangle with a specified perimeter.
    public TriangleWithException(double newPerimeter) {
        setPerimeter(newPerimeter);
        numberOfObjects++;

    }
    //Return perimeter
    public double getPerimeter() {
        return perimeter;
    }

    //set new perimeter
    public void setPerimeter(double newPerimeter) throws IllegalArgumentException {
        if (newPerimeter >= 0)
            perimeter = newPerimeter;
        else
            throw new IllegalArgumentException("Any two sides needs to be grater than the other side");

    }
    // Return numberOFObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //return area of triangle
    public double findArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }
}
