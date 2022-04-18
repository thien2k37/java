package Oop.manage;

public class Test {
    public static void main(String[] args) {
        Family manageFamily = new Family();
        manageFamily.setAddress("ha noi");
        manageFamily.addMember(new Person("thien", "student", 1));
        manageFamily.addMember(new Person("thi", "student", 2));
        manageFamily.display();
        manageFamily.delete("thi");
        manageFamily.display();

        manageFamily.edit("thien", new Person("RO", "GHA", 5));
        manageFamily.display();
    }
}
