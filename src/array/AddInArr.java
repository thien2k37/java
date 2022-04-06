package array;
import java.util.Scanner;

public class AddInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 23, 5, 6, 7};
        System.out.println("add phan tu: ");
        int x = sc.nextInt();
        int[] newArr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[5] = x;
        }
        System.out.println("\nArr after adding element is: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(newArr[i] + " ");
        }
    }
}
