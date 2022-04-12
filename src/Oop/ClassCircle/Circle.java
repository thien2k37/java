package Oop.ClassCircle;
import java.util.Scanner;

public class Circle {
    private double radius;
    public String color;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input radius: ");
        radius = sc.nextDouble();
        Scanner ss = new Scanner(System.in);
        System.out.println("input color radius: ");
        color = ss.nextLine();
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
    }
}
class Hi {
    public static void main(String[] args) {
        Circle sc = new Circle();
        sc.display();
    }
}
