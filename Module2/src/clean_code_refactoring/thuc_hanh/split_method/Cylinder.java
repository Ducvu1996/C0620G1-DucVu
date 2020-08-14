package clean_code_refactoring.thuc_hanh.split_method;

public class Cylinder {
	  public static double getVolume(int radius, int height){
		    double baseArea = getBaseArea(radius);
	        double perimeter = getPerimeter(radius);
	        double volume = perimeter * height + 2 * baseArea;
	        return volume;
	    }
	  static double getBaseArea(double radius) {
		  return Math.PI * radius * radius;
		
	  }
	  static double getPerimeter(double radius) {
		   
		   return  2 * Math.PI  * radius;
	  }
}
