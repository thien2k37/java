package practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager test = new ProductManager();
        Product s1 = new Product(1, "thien", 2.4f);
        Product s2 = new Product(2, "thi", 3.6f);
        Product s3 = new Product(3, "Hường", 5.7f);
        Product s4 = new Product(4, "VAnh", 9.7f);
        Product s5 = new Product(5, "Thanh", 15.6f);

        test.add(s1);
        test.add(s2);
        test.add(s3);
        test.add(s4);
        test.add(s5);

        test.display();

        System.out.println("Sau Khi Sửa: ");
        Product edit = new Product(6, "Trang", 2.4f);
        test.edit("thien", edit);
        test.display();

        System.out.println("NHập tên muôn xóa: ");
        Scanner sc = new Scanner(System.in);
        String ipName = sc.nextLine();
        test.delete(ipName);
        test.display();

        test.sort();
        test.display();




    }
}
