package try_catch;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x: ");
        int x = sc.nextInt();
        System.out.println("nhập y: ");
        int y = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculator(x, y);
    }
    private void calculator(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tổng: x + y = " + a);
            System.out.println("hiêu: x - y = " + b);
            System.out.println("Tích: x * y = " + c);
            System.out.println("Thương: x / y = " + d);
        }catch (Exception e) {
            System.out.println("xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
