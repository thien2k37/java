package array;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập tổng sinh viên: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("ko duoc qua 30 sv");
            }
        }while (size > 30);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhâp điểm của học sinh thứ " + (i + 1 + ":"));
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println("nhưng sinh viên đỗ: " + count);
    }
}
