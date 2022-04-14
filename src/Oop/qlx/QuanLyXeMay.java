package Oop.qlx;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay>{
    private XeMay[] danhSach = new XeMay[3];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {
        if (danhSach[timKiem(name)] != null ) {
            size--;
        }
    }

    @Override
    public int timKiem(String name) {
        for  (int i = 0; i < size; i++) {
            if (name == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----_________________-----");
    }
    public static void main(String[] args) {
        QuanLyXeMay sc = new QuanLyXeMay();
        XeMay xm = new XeMay("Honda", "Đen-Trắng", "Dream", 30, 150);
        XeMay xm1 = new XeMay("Yamaha", "Bạc", "R15", 1500, 250);
        XeMay xm2 = new XeMay("VinFast", "Green", "E34", 7000, 3000);
        sc.them(xm);
        sc.them(xm1);
        sc.them(xm2);
        sc.hienThi();
        XeMay xm4 = new XeMay("VinFast", "Green", "E34", 7000, 3000);
        sc.sua("E34", xm4);
        sc.hienThi();
        sc.sapXep();
        System.out.println("Sau Khi xoa: ");
        sc.xoa("E34");
        sc.hienThi();

    }
}
