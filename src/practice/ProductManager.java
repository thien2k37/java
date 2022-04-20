package practice;

import java.util.ArrayList;

public class ProductManager implements Manage<Product> {
    private ArrayList<Product> listProduct;
    private int size = 0;


    public  ProductManager() {
        this.listProduct = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> listProduct, int size) {
        this.size = size;
        this.listProduct = listProduct;
    }

    @Override
    public void add(Product product) {
        this.listProduct.add(product);
        size++;
    }

    @Override
    public void edit(String name, Product product) {
        listProduct.set(search(name), product);
    }

    @Override
    public void delete(String name) {
        int indexOfStudent = search(name);
        if (indexOfStudent == -1) {
            System.out.println("khong tim thay");
        }else {
            listProduct.remove(indexOfStudent);
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i));
        }
        System.out.println("_______________________");
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        this.listProduct.sort(Product::compareTo);
    }
}
