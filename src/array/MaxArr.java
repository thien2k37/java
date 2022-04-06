package array;
import java.util.Scanner;


public class MaxArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap vao pt thu " + (i + 1) + " la: ");
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mang là: " + max);
    }
}
