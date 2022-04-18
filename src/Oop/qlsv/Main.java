package Oop.qlsv;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent  = new ManageStudent();
        manageStudent.add(new Student(1, "thien", 25));
        manageStudent.display();
        System.out.println(manageStudent.findByName("thien"));
    }
}
