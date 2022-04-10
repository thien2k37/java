package Oop;
import java.util.Scanner;

public class PTBacHai {
    public static void main(String[] args) {
        QuadraticEquation sh = new QuadraticEquation();
        sh.display();
    }
}
class QuadraticEquation{
    private double a, b, c;
    public QuadraticEquation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập c: ");
        c = sc.nextDouble();
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return (- b +  Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (- b -  Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double solution() {
        return - b / 2 * a;
    }

    public void display() {
        if (getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem" );
        }else if (getDiscriminant() > 0) {
            System.out.println("PT co 2 nghiem phan biet x1 = " + getRoot1() + " x2:" + getRoot2());
        }else {
            System.out.println("PT co nghiem kep x1 ,x2: " + solution());
        }
    }
}




