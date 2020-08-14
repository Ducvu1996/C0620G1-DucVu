package abstract_class_interface.thuc_hanh.comparator;

import java.util.Comparator;

import ke_thua.thuc_hanh.shape.Rectangle;

public class Retangle implements Comparator<Rectangle> {

	@Override
	    public int compare(Rectangle r1, Rectangle r2) {
	        if (r1.getWidth() > r2.getWidth()) return 1;
	        else if (r1.getWidth() < r2.getWidth()) return -1;
	        else return 0;
	    }
}
