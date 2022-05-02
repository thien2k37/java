package nhanvien;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        Pattern patternMenu = Pattern.compile("^\\d$");

        String select;
        do {
            System.out.println("----------------------------Menu----------------------------");
            System.out.println(
                    "0. Nhân Viên hiện có. \n"
                            + "1. Thêm Nhân viên mới. \n"
                            + "2. Tìm kiếm nhân viên. \n"
                            + "3. Xóa Nhân viên. \n"
                            + "4. Sửa Thông tin nhân viên. \n"
                            + "5. Đổi trạng thái Làm. \n"
                            + "6. In ra danh sách Nhân Viên FullTime. \n"
                            + "7. Tổng lương Tổng lương Nhân viên FullTime \n"
                            + "8. In ra danh sách Nhân Viên PartTime. \n"
                            + "9. Tổng lương Tổng lương Nhân viên PartTime. \n"
                    + "Thoát Nhấn Enter. "
            );
            System.out.println("Vui lòng chọn chức năng Theo số để tiếp tục:  ");
            select = sc.nextLine();
            if (!patternMenu.matcher(select).find()) {
                System.out.println("Chỉ được nhập 1 sô từ 0-9");
            } else {
                switch (select) {
                    case "0":
                        System.out.println("Nhân Viên hiện có: ");
                        staffManagement.show();
                        break;
                    case "1":
                        System.out.println("Thêm Nhân viên mới: ");
                        staffManagement.add();
                        break;
                    case "2":
                        System.out.println("Tìm kiếm nhân viên");
                        staffManagement.findByName();
                        break;
                    case "3":
                        System.out.println("Xóa Nhân viên: ");
                        staffManagement.removeByName();
                        break;
                    case "4":
                        System.out.println("Sửa Thông tin nhân viên:");
                        staffManagement.editByName();
                        break;
                    case "5":
                        System.out.println("Đổi trạng thái Làm: ");
                        staffManagement.updateStaffStatus();
                        staffManagement.show();
                        break;
                    case "6":
                        System.out.println("In ra danh sách Nhân Viên FullTime:");
                        staffManagement.filterFullTime();
                        break;
                    case "7":
                        System.out.println("Tổng lương danh sách Nhân Viên FullTime: ");
                        staffManagement.calSalaryFullTime();
                        break;
                    case "8":
                        System.out.println("In ra danh sách Nhân Viên PartTime");
                        staffManagement.filterFartTime();
                        break;
                    case "9":
                        System.out.println("Tổng lương Tổng lương Nhân viên PartTime");
                        staffManagement.calSalaryPartTime();
                    default:
                        System.out.println("KHÔng dùng đến");
                }
            }

        } while (patternMenu.matcher(select).find());
    }
}
