package com.assignment.task6;

public class RectangleConstructors {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle rect3 = new Rectangle(7);

        rect1.displayArea();
        rect2.displayArea();
        rect3.displayArea();
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    public void displayArea() {
        System.out.println("Area: " + (length * breadth));
    }
}
