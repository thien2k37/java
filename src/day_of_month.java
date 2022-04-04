import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thang ma ban muon xem ngay: ");
        int month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("the month '2' has 28 - 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month " + month + " has 30 days");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
