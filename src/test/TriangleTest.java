package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.geometry.Triangle;

public class TriangleTest {
	@Test
	public void testTrianglePerimeter() {
		assertEquals(Double.doubleToLongBits(12), Double.doubleToLongBits(new Triangle(3, 4, 5, 2.4).getPerimeter()));
	}

	@Test
	public void testTriangleArea() {
		assertEquals(Double.doubleToLongBits(6), Double.doubleToLongBits(new Triangle(3, 4, 5, 2.4).getArea()));
	}
}