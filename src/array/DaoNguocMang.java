package array;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("độ dài của mảng:");
        n = scanner.nextInt();
        array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhập các phàn tủ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int ii = array.length - 1; ii >= 0; ii--) {
            System.out.print(array[ii] + ", ");
        }
    }
}