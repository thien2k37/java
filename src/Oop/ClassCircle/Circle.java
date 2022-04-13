package Oop.ClassCircle;
import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("input radius: ");
        radius = sc.nextDouble();
        Scanner ss = new Scanner(System.in);
        System.out.println("input color radius: ");
        color = ss.nextLine();*/
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

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled + '\'' +
                ", Area= " + getArea() +
                '}';
    }

}
class Hi {
    public static void main(String[] args) {
        Circle sc = new Circle(1.2, "red");
        System.out.println(sc);
    }
}
