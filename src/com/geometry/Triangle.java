package com.geometry;

public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double sideBase; // osnovanie
	private double height;

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) throws IllegalArgumentException {
		if (side1 <= 0) {
			throw new IllegalArgumentException("Длина стороны треугольника должна быть положительным числом!");
		} else
			this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) throws IllegalArgumentException {
		if (side2 <= 0) {
			throw new IllegalArgumentException("Длина стороны треугольника должна быть положительным числом!");
		} else
			this.side2 = side2;
	}

	public double getSideBase() {
		return sideBase;
	}

	public void setSideBase(double sideBase) throws IllegalArgumentException {
		if (sideBase <= 0) {
			throw new IllegalArgumentException("Длина основания треугольника должна быть положительным числом!");
		} else
			this.sideBase = sideBase;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) throws IllegalArgumentException {
		if (height <= 0) {
			throw new IllegalArgumentException("Высота треугольника должна быть положительным числом!");
		} else
			this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * sideBase * height;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + sideBase;
	}

	// constructor
	public Triangle(double s1, double s2, double sBase, double h) throws IllegalArgumentException {
		setSide1(s1);
		setSide2(s2);
		setSideBase(sBase);
		setHeight(h);
	}
}