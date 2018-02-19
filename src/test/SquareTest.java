package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.geometry.Square;

public class SquareTest {
	@Test
	public void testSquarePerimeter() {
		assertEquals(Double.doubleToLongBits(20), Double.doubleToLongBits(new Square(5).getPerimeter()));
	}

	@Test
	public void testSquareArea() {
		assertEquals(Double.doubleToLongBits(25), Double.doubleToLongBits(new Square(5).getArea()));
	}
}