package Oop.Geometry;

public class Test {
//    private Circle[] ds = new Circle[2];
public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle();
    shapes[1] = new Rectangle();
    shapes[2] = new Square();

    int random = (int)(Math.random() * 50 + 1);

    System.out.println("Mang truoc khi doi: ");
    for (Shape s : shapes) {
        System.out.println(s);
    }

    System.out.println("Manrg sau khi doi");
    for (Shape s : shapes) {
        if (s instanceof  Circle){
            ((Circle) s).resize(random);
        } else if (s instanceof Rectangle){
            ((Rectangle) s).resize(random);
            if (s instanceof Square) {
                ((Square) s).resize(random);
            }else {
                ((Rectangle) s).resize(random);
            }
        }
        System.out.println(s);
    }


}


}
