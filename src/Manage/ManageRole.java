package Manage;

import Manage.file.FileRoleCSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageRole {
    Scanner sc = new Scanner(System.in);
    List<Role> roleList = new ArrayList<>();

    public ManageRole() throws FileNotFoundException {
        roleList = FileRoleCSV.realFromFile();
    }

    public List<Role> getRoleList() {
        return roleList;
    }
    public ManageRole(List<Role> roleList) {
        this.roleList = roleList;
    }

    public void add(Role role) {
        roleList.add(role);
    }
    public void edit(int id, Role role){
        if(findIndexById(id) != -1) {
            roleList.set(findIndexById(id), role);
        }else {
            System.out.println("Không có trong danh sách Role");
        }
    }
    public void delete(int id){
        if(findIndexById(id) != -1) {
            roleList.remove(findById(id));
        }else {
            System.out.println("Không có trong danh sách Role");
        }

    }
    public Role findById(int id) {
        return roleList.get(findIndexById(id));
    }
    public int findIndexById(int id) {
        for (int i = 0; i < roleList.size(); i++) {
            if(roleList.get(i).getId() == id) {
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

}
