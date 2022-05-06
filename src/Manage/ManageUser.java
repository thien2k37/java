package Manage;


import Manage.file.FileUserCSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageUser {
    Scanner sc = new Scanner(System.in);
    List<User> userList = new ArrayList<>();
    public static User currentUser = null;
    public ManageUser() throws FileNotFoundException {
        userList = FileUserCSV.realFromFile();
    }
    public int login(String username, String password) {
        for (User user : userList) {
            if (user.getUserName().equals(username) && user.getPassWord().equals(password)) {
                currentUser = user;
                return 1;
            }
        }
        return 0;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void add(User user) {
        userList.add(user);
    }
    public User findById(int id) {
        return userList.get(findIndexById(id));
    }

    public void edit(int id, User user) {
        userList.set(findIndexById(id), user);
    }
    public void delete(int id){
        userList.remove(findIndexById(id));
    }

    public void findAll() {
        for (User user : userList) {
            System.out.println(user);
        }
    }
    public int findIndexById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getIdUser() == id) {
                return i;
            }
        }
        return -1;
    }

}
