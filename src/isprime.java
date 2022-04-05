import java.util.Scanner;

public class isprime {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String str;
        int number = 2;
        int count = 1;

        while (count <= 20) {
            str = "la SNT";
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    str = "khong phai snt";
                    break;
                }
            }
            if(str.equals("la SNT")) {
                System.out.println(number);
                count++;
            }
            number++;
        }



    }
}
