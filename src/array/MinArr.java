package array;
import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap cac pt thu " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println( "so be nhat trong mang la: " + min(arr));
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
