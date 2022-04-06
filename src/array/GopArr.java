package array;
import java.util.Scanner;

public class GopArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap mang 1 :");
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhap mang 2 :");
            arr2[i] = sc.nextInt();
        }
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++ ) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t") ;
        }

    }
    /*public static void arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap mang ");
        }
    }*/
}
