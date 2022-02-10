package com.company;

public class Circle {
    private static double PI;
    private static double radius;

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    static void area() {
        System.out.println("Area "+PI * (radius * radius));
    }

    static void circumference() {
        System.out.println("Circumfrence "+PI * (2 * radius));

    }

    @Override
    public String toString() {
        area();
        circumference();
        return "Circle{}";
    }
}
