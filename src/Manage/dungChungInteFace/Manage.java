package Manage.dungChungInteFace;

public interface Manage <T>{
    void add(T t);
    T findById();
    void edit(int id, T t);
    void delete(int id);
    void display();
    int findByIndexId(int id);
}
