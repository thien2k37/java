package Oop.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("E34", "VinFast");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("E35", "VinFast");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("E35", "VinFast");
        System.out.println(Car.numberOfCars);
    }
}
