import java.util.Scanner;

public class UocLonNhat{
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("khong co uong chung lon nhat: ");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("uoc lo nhat la: " + a);
    }
}
