package case_module_two.generalManage;

import java.io.IOException;

public interface General<T> {
    void add() throws IOException;
    void edit() throws IOException;
    void delete() throws IOException;
    void display() throws IOException;
    int findIndexById(int id);

}
