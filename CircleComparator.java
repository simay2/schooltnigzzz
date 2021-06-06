package homework;

import java.util.Comparator;

public class CircleComparator implements Comparator<circle> {

	public int compare(circle o1, circle o2) {
		return o1.radius - o2.radius;
	}

}