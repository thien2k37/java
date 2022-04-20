package practice;

public interface Manage<T> {
    //thêm, sửa, xóa, tìm kiếm, hiển thị

    void add(T t);
    void edit(String name, T t);
    void delete(String name);
    void display();
    int search(String name);
    void sort();


}
