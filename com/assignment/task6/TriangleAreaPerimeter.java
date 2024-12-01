package com.assignment.task6;

public class TriangleAreaPerimeter {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
    }
}

class Triangle {
    private int side1 = 3;
    private int side2 = 4;
    private int side3 = 5;

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
