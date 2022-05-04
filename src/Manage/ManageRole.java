package Manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageRole {
    Scanner sc = new Scanner(System.in);
    static List<Role> roleList = new ArrayList<>();
    static {
        roleList.add(new Role(1, "Thien", "Đẹp Trai"));
    }

    public Role input() {
        System.out.println("Nhập ID Role: ");
        int ipID = sc.nextInt();
        System.out.println("Nhập Name: ");
        String ipName = sc.nextLine();
        sc.nextLine();
        System.out.println("Hãy miêu tả nhân vật: ");
        String description = sc.nextLine();
        return new Role(ipID, ipName, description);
    }
    public void add() {
        roleList.add(input());
    }
    public void edit(){
        System.out.println("Nhập Id để tìm kiếm và xóa");
        int editId = sc.nextInt();
        Role role = input();
        if(findById(editId) != -1) {
            roleList.set(findById(editId), role);
        }else {
            System.out.println("Không có trong danh sách Role");
        }
    }
    public void delete(){
        int deleteById = sc.nextInt();
        roleList.remove(findById(deleteById));
    }
    public int findById(int id) {
        for (int i = 0; i < roleList.size(); i++) {
            if (roleList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void showAll() {
        for (Role role: roleList) {
            System.out.println(role);
        }
    }

    public static void main(String[] args) {
        ManageRole manageRole = new ManageRole();

        manageRole.showAll();
        manageRole.edit();
        manageRole.showAll();
    }

}
