package Oop.Last;

import java.util.Scanner;
public class Shape {
    private String color;

    public Shape() {
        System.out.println("Input color: ");
        Scanner sc = new Scanner(System.in);
        color = sc.nextLine();
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor();
    }
    public static void main(String[] args) {
        Shape sc = new Shape();
        System.out.println(sc);
    }
}
