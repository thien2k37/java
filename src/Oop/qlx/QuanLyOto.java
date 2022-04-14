package Oop.qlx;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto>{
    private Oto[] danhSachOto = new Oto[3];
    private int size = 0;
    @Override
    public void them(Oto oto) {
        danhSachOto[size] = oto;
        size++;
    }

    @Override
    public void sua(String name, Oto oto) {
        danhSachOto[timKiem(name)] = oto;
    }

    @Override
    public void xoa(String name) {
        if (danhSachOto[timKiem(name)] != null) {
            size--;
        }
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if(name == danhSachOto[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSachOto);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSachOto[i]);
        }
        System.out.println("-----_________________-----");
    }
    public static void main(String[] args) {
        QuanLyOto sc = new QuanLyOto();
        Oto ot = new Oto("Honda", "Đen-Trắng", "Dream", 30, 150);
        Oto ot1 = new Oto("Yamaha", "Bạc", "R15", 1500, 250);
        Oto ot2 = new Oto("VinFast", "Green", "E34", 7000, 3000);
        sc.them(ot);
        sc.them(ot1);
        sc.them(ot2);
        sc.hienThi();
        Oto ot3 = new Oto("VinFast", "Green", "E34", 7000, 3000);
        sc.sua("E34", ot3);
        sc.hienThi();
        sc.sapXep();
        System.out.println("Sau Khi xoa: ");
        sc.xoa("E34");
        sc.hienThi();

    }
}
