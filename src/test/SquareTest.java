package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.geometry.Square;

public class SquareTest {
	@Test
	public void testSquarePerimeter() {
		Square quadr1 = new Square(5);
		double p = quadr1.getPerimeter();
		assertEquals(Double.doubleToLongBits(20), Double.doubleToLongBits(p));
	}

	@Test
	public void testSquareArea() {
		Square quadr1 = new Square(5);
		double s = quadr1.getArea();
		assertEquals(Double.doubleToLongBits(25), Double.doubleToLongBits(s));
	}
}