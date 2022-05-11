package case_module_two;
import case_module_two.check.InputCheck;
import case_module_two.connectFile.FileAccountCSV;
import case_module_two.generalManage.AccountManage;
import case_module_two.generalManage.ManageMachine;
import case_module_two.generalManage.ServiceManage;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        InputCheck inputCheck = new InputCheck();
        try {
            Scanner sc = new Scanner(System.in);
            ManageMachine machine = new ManageMachine();
            AccountManage accountManage = new AccountManage();
            ServiceManage serviceManage = new ServiceManage();
            FileAccountCSV accountCSV = new FileAccountCSV();
            int select = -1;
            while (select != 0) {
                System.out.println("Menu Đăng Nhập máy chủ ");
                System.out.println("1. Đăng Nhập");
                System.out.println("2. Đăng Ký");
                System.out.println("Vui lòng nhập!");
                select = inputCheck.checkInteger();
                switch (select) {
                    case 1:
                        System.out.println("____Đăng Nhập----");
                        System.out.println("Tên tài khoản:");
                        String acName = sc.nextLine();
                        System.out.println("Mật khẩu");
                        String acPass = sc.nextLine();
                        if (accountManage.login(acName,acPass) != 0) {
                            if(AccountManage.currentName.getAccountName().equals("admin")) {
                                int selectAd = -1;
                                while (selectAd != 0) {
                                    System.out.println("Xin Chào Big Boss");
                                    System.out.println("====================Menu===================");
                                    System.out.println(
                                                       "|*| 1.             Quản lý PC             |*|\n"
                                                    +  "|*| 2.    Quản lý Tài Khoản Khách Hàng    |*|\n"
                                                    +  "|*| 3.      Quản Lý Dịch vu Quán Net      |*|\n"
                                                    +  "|*|=========* Thoát Nhấn 0 * =========|*|\n"
                                    );
                                    selectAd = inputCheck.checkInteger();
                                    switch (selectAd) {
                                        case 1:
                                            System.out.println("|*|===============Máy Tính=============|*|");
                                            System.out.println(
                                                    "|*| 1.      Hiễn Thị Tất Cả Máy         |*|\n"
                                                            +  "|*| 2.  Thêm 1 máy mới vào danh sách    |*|\n"
                                                            +  "|*| 3.    Sửa đổi thông tin của máy     |*|\n"
                                                            +  "|*| 4.     Xóa 1 máy khỏi danh sách     |*|\n"
                                                            +  "|*| 5.     Hiển thị máy tính đang mở    |*|\n"
                                                            +  "|*|=======* Vui lòng nhập tiếp * =======|*|\n"
                                            );
                                            int selectPc = -1;
                                            while (selectPc != 0){
                                                System.out.println("Tiếp tục nhập để chức năng \n Nhập 0 để trở lạị");
                                                selectPc = inputCheck.checkInteger();
                                                switch (selectPc) {
                                                    case 1:
                                                        System.out.println("Hiễn Thị Tất Cả Máy");
                                                        machine.display();
                                                        break;
                                                    case 2:
                                                        System.out.println("Thêm 1 máy mới vào danh sách");
                                                         machine.add();
                                                        break;
                                                    case 3:
                                                        System.out.println("Sửa đổi thông tin của máy");
                                                        machine.edit();
                                                        break;
                                                    case 4:
                                                        System.out.println("Xóa 1 máy khỏi danh sách");
                                                        machine.delete();
                                                        break;
                                                    default:
                                                        System.out.println("Nhập lại boss ơi !");
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("|*|========Tài Khoản khách Hàng=========");
                                            System.out.println(
                                                    "|*| 1.    Hiển thị các Tài Khoản       |*|\n"
                                                            +  "|*| 2.Thêm tải một tài khoản khách hàng|*|\n"
                                                            +  "|*| 3.     Sửa tài khoản khách hàng    |*|\n"
                                                            +  "|*| 4.     Xóa tải khoản khách hàng    |*|\n"
                                                            +  "|*| 5.  Tim kiem tai khoản khách hàng  |*|\n"
                                                            +  "|*|<<<<<< * Vui lòng nhập tiếp * >>>>>>|*|\n"
                                            );
                                            int selectAc = -1;
                                            while (selectAc != 0) {
                                                System.out.println("Tiếp tục nhập để chức năng \n Nhập 0 để trở lạị");
                                                selectAc = inputCheck.checkInteger();
                                                switch (selectAc) {
                                                    case 1:
                                                        System.out.println("Hiển thị các Tài Khoản");
                                                        accountManage.display();
                                                        break;
                                                    case 2:
                                                        System.out.println("Thêm tải một tài khoản khách hàng");
                                                        accountManage.add();
                                                        break;
                                                    case 3:
                                                        System.out.println("Sửa tài khoản khách hàng");
                                                        accountManage.edit();
                                                        break;
                                                    case 4:
                                                        System.out.println("Xóa tải khoản khách hàng");
                                                        accountManage.delete();
                                                        break;
                                                    case 5:
                                                        System.out.println("Tìm kiếm theo tên Tài Khoản");
                                                        accountManage.searchAccount(AccountManage.currentName.getAccountName());
                                                        break;
                                                    default:
                                                        System.out.println("Nhập lại đi Bro");
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("*********|Quản lý dịch vụ|*********");
                                            System.out.println(
                                                    "|*| 1. Hiển Thị dịch vụ Quán net|*|\n"
                                                            +  "|*| 2.    Thêm dịch vụ mới      |*|\n"
                                                            +  "|*| 3. Sửa một dịch vụ nào đó   |*|\n"
                                                            +  "|*| 4.    Xóa một dich vụ       |*|\n"
                                                            +  "|*| 5. Tìm kiêm dịch vụ theo id |*|\n"
                                                            +  "|*|>>>* Vui lòng nhập tiếp * <<<|*|\n"
                                            );
                                            int selectSv = -1;
                                            while (selectSv != 0) {
                                                System.out.println("Tiếp tục nhập để chức năng \n Nhập 0 để trở lạị");
                                                selectSv = inputCheck.checkInteger();
                                                switch (selectSv) {
                                                    case 1:
                                                        System.out.println("Hiển Thị dịch vụ Quán net");
                                                        serviceManage.display();
                                                        break;
                                                    case 2:
                                                        System.out.println("Thêm dịch vụ mới");
                                                        serviceManage.add();
                                                        break;
                                                    case 3:
                                                        System.out.println("Sửa một dịch vụ nào đó");
                                                        serviceManage.add();
                                                        break;
                                                    case 4:
                                                        System.out.println("Xóa một dich vụ");
                                                        serviceManage.delete();
                                                        break;
                                                    case 5:
                                                        System.out.println("tìm kiêm dịch vụ theo id");
                                                        serviceManage.findService();
                                                        break;
                                                    default:
                                                        System.out.println("Chọn lại dịch vụ xếp ơi!");
                                                }
                                            }
                                            break;
                                    }
                                }
                            }else {
                                int select1 = -1;
                                while (select1 != 0) {
                                    System.out.println("Menu Customer");
                                    System.out.println("0. Đăng xuất");
                                    System.out.println("1. Xem Thông tin");
                                    System.out.println("2. Đổi Mật khẩu");
                                    System.out.println("3. Dịch vụ");
                                    System.out.println("Nhâp lựa lựa chọn!");
                                    select1 = inputCheck.checkInteger();
                                    switch (select1) {
                                        case 1:
                                            System.out.println("Xem Thông tin");
                                            accountManage.searchAccount(AccountManage.currentName.getAccountName());
                                            break;
                                        case 2:
                                            System.out.println("Đổi Mật Khẩu mới!");
                                            sc.nextLine();
                                            String newPass = sc.nextLine();
                                            AccountManage.currentName.setPassWord(newPass);
                                            accountCSV.writeToFile(accountManage.getList());
                                            break;
                                        case 3:
                                            System.out.println(">>>>>>>>>Dịch Vụ<<<<<<<<<<");
                                            System.out.println("chọn 1 máy");
                                            machine.showPc();
                                            break;
                                        case 0:
                                            AccountManage.currentName = null;
                                            break;
                                    }
                                }
                            }
                        }else {
                            System.out.println("Tài khoản hoặc mật khẩu không chính xác!");
                        }
                        break;
                    case 2:
                        System.out.println("----Đăng Ký----");
                        accountManage.add();
                        break;
                }
            }
            System.out.println("***********************************************************************");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Nhập Lại!");
        }
    }
}