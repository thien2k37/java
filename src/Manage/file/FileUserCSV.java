package Manage.file;

import Manage.ManageRole;
import Manage.Role;
import Manage.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUserCSV {
    public static List<User> realFromFile() throws FileNotFoundException {
        ManageRole manageRole = new ManageRole();

        File userFile = new File("user.csv");
        List<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(userFile);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.equals("")) {
                break;
            }else {
                String arr[] = line.split(",");
                Role role = manageRole.findById(Integer.valueOf(arr[4]));
                User user = new User(Integer.valueOf(arr[0]), arr[1], arr[2], arr[3], role);
                users.add(user);
            }
        }
        return users;
    }
    public static void writeToFile(List<User>list) throws FileNotFoundException {
        File userFile = new File("user.csv");
        PrintWriter printWriter = new PrintWriter(userFile);
        printWriter.print("id,username,password,role,status\n");
        for (User user : list) {
            printWriter.print(user);
        }
        printWriter.close();
    }
}
