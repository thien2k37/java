import java.util.Scanner;


public class ChuyenDoiTienTe {
    public static double C_F(double C) {
        double f;
        f = (9/5) * C  + 32;
        return f;
    }
    public static double F_C(double F) {
        double c;
        c = (5/9) * (F - 32);
        return c;
    }

    public static void main(String[] args) {
        int chon;
        double C;
        double F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("0 - Exit");
        System.out.println("1 - chuyển đổi Từ C qua F");
        System.out.println("2 - chuyển đổi từ F qua C");
        System.out.println("mời bạn chọn");
        chon = sc.nextInt();
        if (chon == 0) {
            System.exit(0);
        }else if (chon == 1) {
            System.out.println("nhập C tính F");
            C = sc.nextDouble();
            System.out.println("F là: " + C_F(C));
        }else if (chon == 2) {
            System.out.println("nhập F tính C");
            F = sc.nextDouble();
            System.out.println("C là: " + F_C(F));
        }else {
            System.out.println("Bạn nhập ko đúng ");
        }
    }
}