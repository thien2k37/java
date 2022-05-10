package case_module_two.generalManage;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface General<T> {
    void add() throws IOException;
    void edit(int id) throws IOException;
    void delete(int id) throws IOException;
    void display() throws IOException;
    int findIndexById(int id);

}
