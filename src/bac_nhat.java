import java.util.Scanner;

public class bac_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            System.out.println("nghiem cua pt la: " +  -b / a);
        }if (a == 0 && b == 0) {
            System.out.println("pt co vo so nghiem: ");
        }if (a == 0 && b != 0) {
            System.out.println("pt vo nghiem: ");
         }
    }
}
