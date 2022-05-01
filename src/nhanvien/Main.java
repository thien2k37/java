package nhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        /*staffManagement.add(new Staff("thi", "FullTime", "Đang làm", 2));
        staffManagement.add(new Staff("t", "FullTime", "Đang làm", 3));
        staffManagement.add(new Staff("ti", "FullTime", "Nghỉ Làm", 4));
        staffManagement.add(new Staff("fso", "FullTime", "Đang làm", 5));
        staffManagement.add(new Staff("sko", "FullTime", "Nghỉ Làm", 5));
        staffManagement.add(new Staff("fs", "PartTime", "Nghỉ Làm", 1.2));
        Pattern patternTime = Pattern.compile("^[1-2]{1,2}$");


        staffManagement.show();
        System.out.println("sau khi xoa");
        staffManagement.removeByName("thi");
        staffManagement.show();



        System.out.println("Nhân viên Làm full");
        staffManagement.filterFullTime();
        System.out.println("Nhân viên Làm Part");
        staffManagement.filterFallTime();
        System.out.println("tong luong");
        staffManagement.calSalaryFullTime();

        System.out.println("luong fast");
        staffManagement.calSalaryPartTime();

        staffManagement.show();
        System.out.println("sửa status");
        staffManagement.updateStaffStatus("thi",2);
        staffManagement.show();

        System.out.println("sua");
        Staff staff = new Staff("ok", "FullTime", "Nghỉ làm", 1.2);
        staffManagement.editByName("fso",staff);
        staffManagement.show();
        System.out.println("tìm tên");
        staffManagement.findByName("ok");

        staffManagement.add();*/
        staffManagement.show();
        staffManagement.edit();
        staffManagement.show();

    }
}
