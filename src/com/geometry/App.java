package com.geometry;

public class App {

	public static void main(String[] args) {
		try {
			Square quadr1 = new Square(5);
			System.out.println("Perimeter of quadr1 = " + quadr1.getPerimeter());
			System.out.println("Area of quadr1 = " + quadr1.getArea());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

		try {
			Triangle triang1 = new Triangle(3, 4, 5, 2.4);
			System.out.println("Area of triang1 = " + triang1.getArea());
			System.out.println("Perimeter of triang1 = " + triang1.getPerimeter());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
