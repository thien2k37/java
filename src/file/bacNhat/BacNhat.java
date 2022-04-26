package file.bacNhat;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BacNhat  {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        File file1 = new File("display.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        Scanner sc = new Scanner(file);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " " + b);
        if (a == 0) {
            if (b == 0) {
                printWriter.println("PT vo so nghiem: ");
            }else {
                printWriter.println("PT vo Nghieem");
            }
        }else {
            printWriter.println("Pt co nghiem: )" + ( -a / b) + "\n");
        }
        printWriter.close();
    }



}
