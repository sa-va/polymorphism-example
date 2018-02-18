package com.geometry;

public class Square extends Shape {
	private double sideLength;

	public double getSideLength() {

		return sideLength;
	}

	public void setSideLength(double sideLength) throws IllegalArgumentException {
		if (sideLength <= 0) {
			throw new IllegalArgumentException("Длина стороны квадрата должна быть положительным числом!");
		} else
			this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public double getPerimeter() {
		return sideLength * 4;
	}

	// constructor
	public Square(double sideLngth) throws IllegalArgumentException {
		setSideLength(sideLngth);
	}
}
