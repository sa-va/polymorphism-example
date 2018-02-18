package test;

import org.junit.Test;

import com.geometry.Square;
import com.geometry.Triangle;

public class MainTest {
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testWrongSquare() {
		Square quadr1 = new Square(0);
	}

	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void testWrongTriangle() {
		Triangle triang1 = new Triangle(3, 4, 5, -2.4);
	}

}