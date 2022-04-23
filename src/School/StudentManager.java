package School;

public class StudentManager {
    private int number;
    private static int count = 1;
    private String name;
    private String address;
    private int priority;

    public StudentManager() {
    }

    public StudentManager( String name, String address, int priority) {
        this.number = count++;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "number: " + number + ", name: " + name + ", address: " + address + ", priority: " + priority;
    }
}
