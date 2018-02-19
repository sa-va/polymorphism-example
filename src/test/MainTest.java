package test;

import org.junit.Test;

import com.geometry.Square;
import com.geometry.Triangle;

public class MainTest {
	@Test(expected = IllegalArgumentException.class)
	public void testWrongSquare() {
		new Square(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWrongTriangle() {
		new Triangle(3, 4, 5, -2.4);
	}
}