package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.geometry.Triangle;

public class TriangleTest {
	@Test
	public void testTrianglePerimeter() {
		Triangle triang1 = new Triangle(3, 4, 5, 2.4);
		double p = triang1.getPerimeter();
		assertEquals(Double.doubleToLongBits(12), Double.doubleToLongBits(p));
	}

	@Test
	public void testTriangleArea() {
		Triangle triang1 = new Triangle(3, 4, 5, 2.4);
		double s = triang1.getArea();
		assertEquals(Double.doubleToLongBits(6), Double.doubleToLongBits(s));
	}
}