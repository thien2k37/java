import java.util.Scanner;

public class s_cn {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = sc.nextFloat();
        System.out.println("Enter Height: ");
        height = sc.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
