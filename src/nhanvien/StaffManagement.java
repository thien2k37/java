package nhanvien;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StaffManagement {

    public static List<Staff> staffList = new ArrayList<>();
    static {
        staffList.add(new Staff("Nga", "FullTime", "Đang làm", 1500000));
        staffList.add(new Staff("Thi", "FullTime", "Nghỉ Làm", 156789));
        staffList.add(new Staff("Thien", "FullTime", "Đang làm", 70000));
        staffList.add(new Staff("Hung", "FullTime", "Nghỉ Làm", 40000));
        staffList.add(new Staff("Ngần", "PartTime", "Nghỉ Làm", 600000));

    }
    Scanner sc = new Scanner(System.in);
    public Staff input() {
        System.out.println("Nhập Tên Mới: ");
        String nameInput = checkIpName();


        Pattern patternTime = Pattern.compile("^[1-2]{1,2}$");
        String type;
        do {
            System.out.println("Nhập loại: 1.FullTime, 2.PartTime: ");
            type = sc.nextLine();
            if (!patternTime.matcher(type).find()) {
                System.out.println(type + " Không hợp lệ, nhập lại");
            } else {
                System.out.println("Vì bạn quá đẹp trai nên ad sẽ cho qua.");
               if (type.equals("1")){
                   type = "FullTime";
               }else {
                   type = "PartTime";
               }
                break;
            }
        } while (true);

        Pattern patternStatus = Pattern.compile("^[1-2]{1,2}$");
        String status;
        do {
            System.out.println("Nhập Trạng Thái : 1.Đang Làm, 2.Nghỉ Làm");
            status = sc.nextLine();
            if (!patternStatus.matcher(status).find()) {
                System.out.println(status + " Không hợp lệ");
            } else {
                System.out.println("Cho qua!");
                if(status.equals("1")) {
                    status = "Đang Làm";
                    break;
                }else {
                    status = "Nghỉ Làm";
                }
                break;
            }
        } while (true);
        System.out.println("Nhập Lương: ");
        double salary = sc.nextDouble();
        return new Staff(nameInput, type, status, salary);
    }
    public void add() {
        String testName = checkIpName();
        if(findById(testName) != -1) {
            System.out.println("Tên này đã có Người sử dung mời bạn sử dụng tên khác. ");
        }else {
            staffList.add(input());
            show();
        }
    }
    public String checkIpName() {
        Pattern patternCheckIpName = Pattern.compile("^[A-Z][a-z]+$");
        String ipName;
        do {
            ipName = sc.nextLine();
            if (!patternCheckIpName.matcher(ipName).find()) {
                System.out.println(ipName + " Nhập tên không hợp lệ.");
            }else {
                System.out.println(ipName + " Tên đẹp ấy ");
                break;
            }
        }while (true);
        return ipName;
    }

    public void editByName(){
        System.out.println("Nhập tên muốn tìm ");
        String nameEdit = checkIpName();
        do {
            try{
                if (findById(nameEdit) != -1) {
                    Staff staff = input();
                    staffList.set(findById(nameEdit), staff);
                    break;
                }
            }catch (Exception e) {
                System.out.println("có cũng như không;");
            }
            System.out.println(nameEdit + " Không có trong danh sách.");
            System.out.println("------------------------------");
            editByName();
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
    public void findByName() {
        String name = checkIpName();
        if (findById(name) == -1) {
            System.out.println( name + ": không có trong danh sách.");
        }else {
            System.out.println(staffList.get(findById(name)));
        }
    }


    public void removeByName() {
        String name = checkIpName();
        if (findById(name) == -1) {
            System.out.println( name + ": không thể xóa vì không có trong danh sách.");
        }else {
            staffList.remove(staffList.get(findById(name)));
            show();
        }
    }

    public void updateStaffStatus() {
        String name = checkIpName();
        String updateStatus;
        Pattern patternStatus = Pattern.compile("^[1-2]{1,2}$");
        do {
            System.out.println("Nhập Trạng Thái : 1.Đang Làm, 2.Nghỉ Làm");
            updateStatus = sc.next();
            if(!patternStatus.matcher(updateStatus).find()){
                System.out.println(updateStatus + " Chỉ được nhập 1 hoăc 2 thôi :))");
            }else {
                if (findById(name) == -1) {
                    System.out.println( name + ": Không có trong danh sách trong danh sách.");
                }else {
                    if (updateStatus.equals("1")) {
                        staffList.get(findById(name)).setStatus("Đang Làm");
                    }else {
                        staffList.get(findById(name)).setStatus("Nghỉ Làm");
                    }
                }
                break;
            }
        }while (true);

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
        System.out.println("Tổng: " + sumLam + sumNghi);

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
        System.out.println("Tổng lương nhân Viên PartTime Đang làm: " +  sumSalaryPartTime1 / 2);
        System.out.println("Tổng lương nhân viên PartTime Nghỉ Làm: " +  sumSalaryPartTime2 / 2);
        System.out.println("Tổng Lương PartTime" + (sumSalaryPartTime1 + sumSalaryPartTime2)/2);
    }
    public void filterFullTime(){
        for (Staff staff : staffList) {
            if (staff.getType().equals("FullTime")) {
                System.out.println(staff);
            }
        }
    }
    public void filterFartTime(){
        for (Staff staff : staffList) {
            if (staff.getType().equals("PartTime")) {
                System.out.println(staff);
            }
        }
    }
}
