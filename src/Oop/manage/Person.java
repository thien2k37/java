package Oop.manage;

public class Person {
    private String name;
    private String job;
    private int identityCard;



    public Person(String name, String job, int identityCard) {
        this.name = name;
        this.job = job;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return "Person " + "name='" +getName()  + ", job='" + getJob() + "', identityCard=" + getIdentityCard()+ "; ";
    }
}
