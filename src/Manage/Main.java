package Manage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        ManageUser manageUser = new ManageUser();
        Pattern menu = Pattern.compile("^[1,3]$");
        String select;
        do {

            System.out.println("=====MENU=====\n"+
                    "1. Đăng Nhập  \n"
                            + "2. Đăng Ký \n"
                            + "3. Thoát\n"
                    + "=====+====="
            );
            System.out.println("Chọn đi ");
            select = sc.nextLine();
            if (!menu.matcher(select).find()) {
                System.out.println("chỉ được nhập 1, 2 hoặc 3 để đi tiếp ");
            }else {
                switch (select) {
                    case "1":
                        manageUser.register();
                        break;
                    case "2":
                        manageUser.login();
                        break;
                    case "3":
                        manageUser.exit();
                        break;
                    default:
                }
            }
            menu();
        }while (menu.matcher(select).find());
    }
}
