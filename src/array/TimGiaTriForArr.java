package array;
import java.util.Scanner;

public class TimGiaTriForArr {
    public static void main(String[] args) {
        String[] studens = {"thien", "son", "hunw", "huy", "nam"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kiem tra ten: ");
        String ip_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(ip_name)) {
                System.out.println("ten hoc sinh co trong lop: " + ip_name + " " + (i + 1)) ;
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(ip_name + " khong co trong mang");
        }
    }
}
