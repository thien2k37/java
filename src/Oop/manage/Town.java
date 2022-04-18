package Oop.manage;

import java.util.ArrayList;

public class Town {
    ArrayList<Family> family;

    public Town() {
        this.family = new ArrayList<>();
    }

    public void addFamily(Family family) {
        this.family.add(family);
    }
    public void display() {
        for (Family value : family) {
            value.display();
        }
        System.out.println("-------------");
    }

    public int findByAddress(String address) {
        for (int i = 0; i < family.size(); i++) {
            if (family.get(i).getAddress().equals(address)) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String address) {
        this.family.remove(findByAddress(address));
    }
    public void edit(String address, Family family) {
        this.family.set(findByAddress(address), family);
    }
}
