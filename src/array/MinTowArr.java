package array;

import java.util.Scanner;

public class MinTowArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][3];
        System.out.print("Enter " + arr.length + " rows and " +
                arr[0].length + " columns: ");
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("so be nhat trong mang la: " +min);
    }
}
