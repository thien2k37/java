package Oop.Last;

public class Triangle extends Shape{
    private double side1 = 2.0;
    private double side2 = 2.0;
    private double side3 = 2.0;




    public Triangle() {
       /*System.out.println("Nhập cạnh side1: " );
       side1 = sc.nextDouble();
       System.out.println("Nhập cạnh side2: " );
       side2 = sc.nextDouble();
       System.out.println("Nhập cạnh side2: " );
       side3 = sc.nextDouble();*/
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        return (side1 * side1) * Math.sqrt(3) / 4;
    }
    public double getPerimeter() {
        return side1 * 3;
    }

    @Override
    public String toString() {
        return "Điện tích tam giác: " + getArea()+ ", màu: " + getColor() + ", Chu Vi tam gia: " + getPerimeter();
    }
    public static void main(String[] args) {
        Triangle sc = new Triangle();
        System.out.println(sc);
    }
}

