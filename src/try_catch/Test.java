package try_catch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Check check = new Check();



        System.out.println("Nhập cạnh a: ");
        int a = sc.nextInt();

        System.out.println("Nhập cạnh b: ");
        int b = sc.nextInt();

        System.out.println("Nhập cạnh c: ");
        int c = sc.nextInt();

        try {
            check.CheckTriangle(a, b ,c);
        }catch (Triangle e) {
            System.out.println(e);
        }
    }

}
