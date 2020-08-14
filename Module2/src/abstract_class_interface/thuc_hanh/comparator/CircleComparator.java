package abstract_class_interface.thuc_hanh.comparator;

import java.util.Comparator;

import ke_thua.thuc_hanh.shape.Circle;

public class CircleComparator implements Comparator<Circle> {

	@Override
	    public int compare(Circle c1, Circle c2) {
	        if (c1.getRadius() > c2.getRadius()) return 1;
	        else if (c1.getRadius() < c2.getRadius()) return -1;
	        else return 0;
	    }
}
