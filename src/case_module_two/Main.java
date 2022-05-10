package case_module_two;
import case_module_two.generalManage.AccountManage;
import case_module_two.generalManage.ManageMachine;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ManageMachine machine = new ManageMachine();
        AccountManage accountManage = new AccountManage();
        int select = -1;
        while (select != 0) {
            System.out.println("Menu");
            System.out.println("1. Đăng Nhập");
            System.out.println("2. Đăng Ký");
            System.out.println("Vui lòng nhập!");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("____Đăng Nhập----");
                    System.out.println("Tên tài khoản:");
                    String acName = sc.nextLine();
                    System.out.println("Mật khẩu");
                    String acPass = sc.nextLine();
                    if (accountManage.login(acName,acPass) != -1) {
                        int select1 = -1;
                        while (select1 != 0) {
                            System.out.println("");
                        }
                    }
                case 2:
                    System.out.println("----Đăng Ký----");


            }
        }


    }
}