package nhanvien;

public class Staff {
    private String name;
    private String type ;
    private String status;
    private double salary;

    public Staff() {
    }

    public Staff(String name, String type, String status, double salary) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "name: " + name + ", type " + type + ", status: " + status + ", salary: " + salary;
    }
}
