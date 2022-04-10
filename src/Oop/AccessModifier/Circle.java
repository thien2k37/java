package Oop.AccessModifier;


public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }
    public  Circle(String color) {
        this.color = color;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public double getArea() {
        return getRadius()*getRadius() * Math.PI;
    }
}
