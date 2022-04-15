package unitTest;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManage sc = new StudentManage();
        Students s1 = new Students(1, "thien" ,22, 9.5 );
        Students s2 = new Students(2, "messi" ,38, 5.0 );
        Students s3 = new Students(3, "rooney" ,47, 6.5 );
        sc.add(s1);
        sc.add(s2);
        sc.add(s3);
        sc.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một trong 3 tên này : thien, messi, rooney muốn tìm kiếm: ");
        String name;
        do{
        name = scanner.nextLine();
        if (sc.search(name) == -1) {
            System.out.println( "nhap lai");
        }else  {
            System.out.println("vị trí của tên muốn tìm: " + sc.search(name));
        }}while(sc.search(name) == -1);
        System.out.println("nhập tên sinh viên muốn sửa: ");
        Students s4 = new Students(4, "ronaldo" ,36, 9.0 );
        sc.edit("thien", s4);
        sc.display();
        System.out.println("Sau Khi xóa: " + s2.getName());
        sc.delete("messi");
        sc.display();
    }
}
