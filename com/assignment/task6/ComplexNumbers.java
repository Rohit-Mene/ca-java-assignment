package com.assignment.task6;

import java.util.Scanner;

public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real and imaginary parts of the first complex number: ");
        Complex c1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter real and imaginary parts of the second complex number: ");
        Complex c2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close();
    }
}

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
