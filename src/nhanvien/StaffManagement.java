package nhanvien;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StaffManagement {

    public static List<Staff> staffList = new ArrayList<>();
    static {
        staffList.add(new Staff("t", "FullTime", "Đang làm", 3));
        staffList.add(new Staff("ti", "FullTime", "Nghỉ Làm", 4));
        staffList.add(new Staff("fso", "FullTime", "Đang làm", 5));
        staffList.add(new Staff("sko", "FullTime", "Nghỉ Làm", 5));
        staffList.add(new Staff("fs", "PartTime", "Nghỉ Làm", 1.2));

    }
    Scanner sc = new Scanner(System.in);
    public Staff input() {
       Pattern patternName = Pattern.compile("^[A-Z][a-z]+$");
        String nameInput;
        do {
            System.out.println("Nhập Tên: ");
            nameInput = sc.nextLine();
            if (!patternName.matcher(nameInput).find()) {
                System.out.println(nameInput + " Không hợp lệ:");
            } else {
                break;
            }
        } while (true);
        Pattern patternTime = Pattern.compile("^[1-2]{1,2}$");
        String type;
        do {
            System.out.println("Nhập loại (1 = FullTime/ 2 = PartTime): ");
            type = sc.nextLine();
            if (!patternTime.matcher(type).find()) {
                System.out.println(type + " Không hợp lệ");
            } else {
                break;
            }
        } while (true);
        Pattern patternStatus = Pattern.compile("^[1-2]{1,2}$");
        String status;
        do {
            System.out.println("Nhập Status (1 = Đang Làm / 2 = Nghỉ làm): ");
            status = sc.nextLine();
            if (!patternStatus.matcher(status).find()) {
                System.out.println(status + " Không hợp lệ");
            } else {
                break;
            }
        } while (true);
        System.out.println("Nhập Lương: ");
        double salary = sc.nextDouble();
        return new Staff(nameInput, type, status, salary);
    }
    public void add() {

    }
    public void edit() {
        System.out.println("Bạn muốn sửa chương trình ");
        System.out.println("Nhập tên muốn tìm ");
        String nameEdit = sc.nextLine();
        do {
            try{
                if (findById(nameEdit) != -1) {
                    Staff thu = input();
                    staffList.set(findById(nameEdit), thu);
                    break;
                }
            }catch (Exception e) {
                System.out.println("có cũng như không;");
            }
            System.out.println(nameEdit + " Không có trong danh sách.");
            System.out.println("------------------------------");
            edit();
        }while (findById(nameEdit) != -1);
    }

    public void show() {
        for (Staff staff: staffList) {
            System.out.println(staff);
        }
    }

    public int findById(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public void findByName(String name) {
      if (findById(name) == -1) {
          System.out.println( name + ": không có trong danh sách.");
      }else {
          System.out.println(staffList.get(findById(name)));
      }
    }

    public void editByName(String name, Staff staff) {
        if (findById(name) == -1) {
            System.out.println( name + ": không có trong danh sách.");
        }else {
            staffList.set(findById(name), staff);
        }
    }

    public void removeByName(String name) {
        if (findById(name) == -1) {
            System.out.println( name + ": không thể xóa vì không có trong danh sách.");
        }else {
            staffList.remove(staffList.get(findById(name)));
        }
    }

    public void updateStaffStatus(String name, int v) {
        if (findById(name) == -1) {
            System.out.println( name + ": Không có trong danh sách trong danh sách.");
        }else {
            if (v == 1) {
                staffList.get(findById(name)).setStatus("Đang Làm");
            }if (v == 2) {
                staffList.get(findById(name)).setStatus("Nghỉ Làm");
            }
        }
    }
    public void calSalaryFullTime() {
        double sumLam = 0;
        double sumNghi = 0;
        for (Staff staff : staffList) {
            if (staff.getType().equals("FullTime")) {
                if (staff.getStatus().equals("Đang làm")) {
                    sumLam += staff.getSalary();
                }
                if (staff.getStatus().equals("Nghỉ Làm")) {
                    sumNghi += staff.getSalary();
                }
            }
        }
        System.out.println("Tong luong nhân viên fulll đang làm: " + sumLam);
        System.out.println("Tong luong nhân viên fulll Nghỉ Làm: " + sumNghi);

    }
    public void calSalaryPartTime(){
        double sumSalaryPartTime1 = 0;
        double sumSalaryPartTime2 = 0;
        for (Staff staff : staffList) {
            if (staff.getType().equals("PartTime")) {
                if (staff.getStatus().equals("Đang làm")) {
                    sumSalaryPartTime1 += staff.getSalary();
                }
                if (staff.getStatus().equals("Nghỉ Làm")) {
                    sumSalaryPartTime2 += staff.getSalary();
                }
            }
        }
        System.out.println("Tong luong nhân viên part đang làm: " + sumSalaryPartTime1 / 2);
        System.out.println("Tong luong nhân viên part Nghỉ Làm: " + sumSalaryPartTime2 / 2);
    }
    public void filterFullTime(){
        for (Staff staff : staffList) {
            if (staff.getType().equals("FullTime")) {
                System.out.println(staff);
            }
        }
    }
    public void filterFallTime(){
        for (Staff staff : staffList) {
            if (staff.getType().equals("PartTime")) {
                System.out.println(staff);
            }
        }
    }
}
