package Oop;
import java.util.Scanner;

class HCN {
    // 2 thuộc tính chieuf dai , rông
    double cd , cr;
    /*getInformation() là phương thức nhập dữ liệu cho thuộc tính length và width từ bàn phím.*/
    public void getInformation() {
        Scanner sc = new Scanner((System.in));
        System.out.println("nhập cd");
        cd = sc.nextDouble();
        System.out.println("nhập cr");
        cr = sc.nextDouble();
    }
    /*getArea() và getPerimeter() là hai phương thức trả về diện tích và chu vi của hình chữ nhật,\
     hai phương thức này được dùng trong phương thức display().*/
    public double getArea() {
        return cd * cr;
    }
    public double getPerimeter () {
        return (cd + cr) * 2;
    }
    /*display() là phương thức dùng để hiển thị thông tin về chu vi và diện tích của hình chữ nhật ra màn hình.*/
    public void display() {
        System.out.println("Chu vi: " + getArea());
        System.out.println("Tinh S: " + getPerimeter());
    }
}

public class Rectangle {
    public static void main(String[] args) {
        HCN r1 = new HCN();
        r1.getInformation();
        r1.display();
    }
}