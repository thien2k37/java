package Oop.ClassCircle;
import java.util.Scanner;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super(3.6);
        System.out.println("input height: ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextDouble();
    }

    public Cylinder(double height) {
        super(3.6);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return height * getArea();
    }
    @Override
    public String toString() {
        super.toString();
        return "height: " + height + "\n" + "Volume: " + getVolume() ;
    }
}
class HiHi {
    public static void main(String[] args) {
        Cylinder ss = new Cylinder();
        System.out.println(ss);
    }
}
