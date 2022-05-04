package Manage;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageUser {
    Scanner sc = new Scanner(System.in);
    List<Users> userList = new ArrayList<>();
    ManageRole manageRole = new ManageRole();

    public Users input() {
        System.out.println("Nhập ID USER: ");
        int ipID = sc.nextInt();
        System.out.println("Tên Đăng Nhập: ");
        String ipName = sc.nextLine();
        sc.nextLine();
        System.out.println("Mật Khẩu: ");
        String pass = sc.nextLine();
        System.out.println("Cập Nhật Trạng Thái: ");
        String status = sc.nextLine();
        System.out.println("Chọn Nhân vật");
        manageRole.showAll();
        int idRole = sc.nextInt();
        return new Users(ipID, ipName, pass, status, ManageRole.roleList.get(manageRole.findById(idRole)));
    }
    public void register() {
        userList.add(input());
    }
    public void login() {
        System.out.println("Tên Tài Khoản: ");
        String user = sc.nextLine();
        System.out.println("Nhập Mật Khẩu: ");
        String pass = sc.nextLine();
        if(findByUser(user,pass) != -1) {
            System.out.println("Tài Khoản hoặc Mật Khẩu khoogn chính xác.");
        }else {

        }
    }
    public int findByUser(String user, String pass) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(user) && userList.get(i).getPassWord().equals(pass)) {
                return i;
            }
        }
        return -1;
    }
    public void exit(){
        System.exit(0);
    }

}
