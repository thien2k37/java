package unitTest;

public interface Manage<T> {
    //thêm, sửa, tìm kiếm, hiển thị

    void add(T t);
    void edit(String name, T t);
    int search(String name);
    void delete(String name);
    void display();




}
