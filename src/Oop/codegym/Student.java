package Oop.codegym;

public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    //ham de khoi tai bien
    Student(int r, String n) {
        id = r;
        name = n;
    }

    //static method to change the value of static variable
    //pt static de thay doi gia tri cuar bieen static
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
