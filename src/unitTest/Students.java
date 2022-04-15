package unitTest;

public class Students extends Person implements Comparable<Students>{
    private double score;

    public Students() {

    }

    public Students(int id, String name, int age, double score) {
        super(id, name, age);
        this.score = score;
    }

    public Students(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" + "ID: " + getId() +
                ", Name: " + getName() +
                ", Age: " +getAge() +
                ", Điểm: " + score + '}';
    }

    @Override
    public int compareTo(Students students) {
        return 0;
    }
}
