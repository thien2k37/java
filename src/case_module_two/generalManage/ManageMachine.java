package case_module_two.generalManage;
import case_module_two.check.InputCheck;
import case_module_two.connectFile.FileMachineCSV;
import case_module_two.model.Machine;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManageMachine implements General<Machine> {

    InputCheck check = new InputCheck();

    List<Machine> machineList;
    FileMachineCSV machineCSV = new FileMachineCSV();


    public ManageMachine() throws IOException {
        machineList = FileMachineCSV.readFromFile();
    }
    public List<Machine> getMachineList(){
        return machineList;
    }

    @Override
    //xong
    public void add() throws IOException {
        getMachineList().add(inputMachine());
        machineCSV.writeToFile(getMachineList());
        System.out.println("Thêm thành công");
        display();
    }

    @Override
    public void edit() throws IOException {
        System.out.println("nhập ID để sửa");
        int id = check.checkInteger();
        if(findIndexById(id) != -1) {
            getMachineList().set(findIndexById(id), inputMachine());
            machineCSV.writeToFile(getMachineList());
            System.out.println("Sửa thành công ");
        }else {
            System.out.println(id + "không có trong danh sách: ");
        }
    }

    @Override
    //xong
    public void delete() throws IOException {
        System.out.println("Nhập Id để xóa");
        int id = check.checkInteger();
        if (findIndexById(id) != -1) {
            getMachineList().remove(findIndexById(id));
            machineCSV.writeToFile(getMachineList());
        }else {
            System.out.println(id + " Không có trong danh sách;");
        }

    }

    @Override
    //xong
    public void display() throws IOException {
        for (Machine o : machineList) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------------");
    }

    //done
    public void findPcById(){
        System.out.println("Nhập id để tìm máy");
        int id = check.checkInteger();
        if(findIndexById(id) == -1) {
            System.out.println(id + " ID này ko có trong danh sách.");
        }else {
            System.out.println(getMachineList().get(findIndexById(id)));
        }
    }

    @Override
    //done
    public int findIndexById(int id) {
        for (int i = 0; i < getMachineList().size(); i++) {
            if (getMachineList().get(i).getNamePC() == id) {
                return i;
            }
        }
        return -1;
    }
    //ok
    public Machine inputMachine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập trạng thái máy");
        Pattern patternStatus = Pattern.compile("^[1-2]{1,2}$");
        String status;
        do {
            System.out.println("Input status: 1.ON, 2.OFF: ");
            status = sc.nextLine();
            if (!patternStatus.matcher(status).find()) {
                System.out.println(status + " Không hợp lệ, nhập lại");
            } else {
                if (status.equals("1")){
                    status = "ON";
                }else {
                    status = "OFF";
                }
                break;
            }
        } while (true);
        return new Machine(status);
    }

    public Machine findPcById(int id) {
        return machineList.get(findIndexById(id));
    }
    public void showPc() {
        for (Machine machine: machineList) {
            if(machine.getStatusPC().equals("ON")) {
                System.out.println(machine);
            }
        }
    }
}