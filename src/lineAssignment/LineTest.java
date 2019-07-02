package lineAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void testGetSlope() {
		double x1 = Math.random();
		double x2 = Math.random();
		double y1 = Math.random();
		double y2 = Math.random();
		
		Line testLine = new Line(x1, y1, x2, y2);
		double val = testLine.getSlope();
		double val2 = (x2 - x1 ) / (y2 - y1);
		
		assertTrue(val - val2 <= .0001);
	}

	@Test
	void testGetDistance() {
		double x1 = Math.random();
		double x2 = Math.random();
		double y1 = Math.random();
		double y2 = Math.random();
		
		Line testLine = new Line(x1, y1, x2, y2);
		double val = testLine.getDistance();
		double val2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		assertTrue(val - val2 <= .001);
	}

	@Test
	void testParallelTo() {
		double x1 = Math.random();
		double x2 = Math.random();
		double y1 = Math.random();
		double y2 = Math.random();
		double X1 = Math.random();
		double X2 = Math.random();
		double Y1 = Math.random();
		double Y2 = Math.random();
		
		Line testLine = new Line(x1, y1, x2, y2);
		Line testLine2 = new Line( X1, Y1, X2, Y2);
		boolean case1 = testLine.parallelTo(testLine2);
		double val1 = testLine.getSlope();
		double val2 = testLine2.getSlope();
		boolean case2 = val1 - val2 <= .001;
		assertTrue(case1 == case2);
	}

}
