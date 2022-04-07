package Oop;
import java.util.Scanner;

public class CanBacHai {
    public static void main(String[] args) {
        QuadraticEquation sc = new QuadraticEquation();
        sc.getInformation();
        sc.display();
        System.out.println(sc.getDiscriminant());

    }
}
class QuadraticEquation{
    double a ,b, c;
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập c: ");
        c = sc.nextDouble();
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