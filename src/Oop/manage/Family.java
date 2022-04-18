package Oop.manage;

import java.util.ArrayList;

public class Family {
    ArrayList<Person> member = new ArrayList<>();
    private String address;
    private int nb_member = 0;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addMember(Person person){
        member.add(person);
        nb_member++;
    }
    public void display() {
        for (Person person : member) {
            System.out.println(person);
        }
        System.out.println("Address: " + address+", members: "+ nb_member);
        System.out.println("-------------");
    }

    public int findByName(String name) {
        for(int i = 0; i < member.size(); i++) {
            if (member.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void delete(String name) {
        int search = findByName(name);
        if (search == -1) {
            System.out.println("khong cos");
        }
        else {
            member.remove(search);
            nb_member--;
        }
    }

    public void edit(String name, Person person) {
        int search = findByName(name);
        if (search == -1) {
            System.out.println("khong co");
        }else {
            member.set(search, person);
        }
    }
}
