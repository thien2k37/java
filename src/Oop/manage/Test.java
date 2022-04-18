package Oop.manage;

public class Test {
    public static void main(String[] args) {
        Family manageFamily = new Family();
        manageFamily.setAddress("ha noi");
        manageFamily.addMember(new Person("thien", "student", 1));
        manageFamily.addMember(new Person("thi", "student", 2));
        Family manageFamily1 = new Family();
        manageFamily1.setAddress("Sai Gon");
        manageFamily1.addMember(new Person("hi", "sv", 1));
        manageFamily1.addMember(new Person("hh", "sv", 2));
        manageFamily.display();

        System.out.println("sau Khi xóa");
        manageFamily.delete("Sai Gon");
        manageFamily.display();

        manageFamily.edit("thien", new Person("RO", "GHA", 5));
        manageFamily.display();

        Family manageFamily4 = new Family();
        manageFamily4.setAddress("NA");
        manageFamily4.addMember(new Person("hi", "sv", 1));
        manageFamily4.addMember(new Person("hh", "sv", 2));

        Family manageFamily6 = new Family();
        manageFamily6.setAddress("VN");
        manageFamily6.addMember(new Person("thu", "sv", 1));
        manageFamily6.addMember(new Person("đong", "sv", 2));
        Town sc = new Town();
        sc.addFamily(manageFamily6);
        sc.addFamily(manageFamily4);
        sc.display();
        Family manageFamily5 = new Family();
        manageFamily5.setAddress("HT");
        manageFamily5.addMember(new Person("nhuAnh", "sv", 1));
        manageFamily5.addMember(new Person("hoang", "sv", 2));
        System.out.println("Sau Khi sửa");
        sc.edit("NA", manageFamily5);
        sc.display();
        System.out.println("Sau Khi xóa");
        sc.delete("VN");
        sc.display();

    }
}
