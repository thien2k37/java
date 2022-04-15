package unitTest;

public class StudentManage implements Manage<Students> {
    private Students[] listStudent = new Students[3];
    private int size = 0;
    @Override
    public void add(Students students) {
        listStudent[size] = students;
        size++;
    }

    @Override
    public void edit(String name, Students students) {
        listStudent[search(name)] = students;
    }

    @Override
    public int search(String name) {
        for(int i = 0; i < size; i++) {
            if (name.equals(listStudent[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void delete(String name) {
        if(listStudent[search(name)] != null) {
            size--;
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(listStudent[i]);
        }
        System.out.println("---------_________>>>><<<<________---------");
    }
}
