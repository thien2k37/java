import java.util.Scanner;

public class isprime {
    public static void main(String args[])
    {
        int number;
        int count = 1;
        int n = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        number = scanner.nextInt();
        if (number >= 1)
        {
            System.out.println(number+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <= number ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(n) ; j++ )
            {
                if ( n % j == 0 )
                {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 )
            {
                System.out.println(n);
                i++;
            }
            count = 1;
            n++;
        }
    }
}
