package School;

import java.util.ArrayList;
import java.util.List;

public class Admissions implements Manage<StudentManager> {
    List<StudentManager> studentManagerList = new ArrayList<>();

    @Override
    public void add(StudentManager studentManager) {
        studentManagerList.add(studentManager);
    }

    @Override
    public void display() {
        for (StudentManager studentManager : studentManagerList) {
            System.out.println(studentManager);
        }
        System.out.println("___________________________");
    }

    @Override
    public void fineByNumberL(int sbd) {
        for (StudentManager i: studentManagerList) {
            if(i.getNumber() == sbd) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void exit(int exit) {
        System.exit(0);
    }
}
