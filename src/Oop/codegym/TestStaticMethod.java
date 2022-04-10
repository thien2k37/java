package Oop.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // goi phuong thucs change();

        // creating objects
        Student s1 = new Student(111, "thien");
        Student s2 = new Student(222, "thi");
        Student s3 = new Student(333, "hung");


        //call display method;
        s1.display();
        s2.display();
        s3.display();
    }
}
