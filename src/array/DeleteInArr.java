package array;
import java.util.Scanner;


public class DeleteInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap pt vao mang; ");
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap tu can xoa");
        int x = sc.nextInt();

        int viTriCanXoa = viTriPT(arr,x);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < viTriCanXoa; i++) {
            newArr[i] = arr[i];
        }
        for (int i = viTriCanXoa; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        arr = newArr;
        inMang(arr);

    }
    static int viTriPT(int[] mang, int socantim) {
        int viTri = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == socantim) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void inMang(int[] mang) {
        System.out.println("Mảng là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+"\t");
        }
    }
}