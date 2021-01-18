package model;

import java.awt.Shape;
import java.awt.geom.Area;

public class Model {

	
	public static boolean testIntersection(Shape shapeA, Shape shapeB) {
		Area areaA = new Area(shapeA);
		areaA.intersect(new Area(shapeB));
		return !areaA.isEmpty();
	}
}
