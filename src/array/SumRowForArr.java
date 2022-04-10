package array;
import java.util.Scanner;


public class SumRowForArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 4, 5},
                {2, 5, 6, 2},
                {2, 6, 7, 4}
        };

        for (int column = 0; column < arr[0].length; column++) {
            int total = 0;
            for (int row = 0; row < arr.length; row++)
                total += arr[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }

    }
  /*  static int viTri(int[][] arr) {
        int vitri = -1;
        for (int i = 0; i < ar.length; i++) {
            if (a == ar[i]) {
                vitri = i;
            }
        }return vitri;
    }
    static void inMang(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }*/

}
