package quanly;

import java.util.ArrayList;

public class QLCB implements QuanLy<CanBo>{

    private final ArrayList<CanBo> danhSach;


    public QLCB() {
        this.danhSach = new ArrayList<>();
    }
    @Override
    public void them(CanBo canBo) {
        this.danhSach.add(canBo);
    }

    @Override
    public void timKiem(String name) {
        for (CanBo sach : danhSach) {
            if (sach.getHoTen().equals(name)) {
                System.out.println(sach);
            }
        }
    }

    @Override
    public void hienThiDanhSachCanBo() {
        for (CanBo sach : danhSach) {
            System.out.println(sach);
        }
        System.out.println("________________-------_____________");
    }

    @Override
    public void out() {
        System.exit(0);
    }

    public static void main(String[] args) {
        QuanLy<CanBo> quanLy = new QLCB();
        CanBo canBo1 = new CanBo("thien", 22, "Nam", "NA");
        CanBo canBo2 = new CanBo("Sơn", 40, "Nam", "Thanh Hóa");
        CanBo canBo3 = new CanBo("Tuệ", 25, "Nam", "HT");
        CanBo canBo4 = new CanBo("Hoa", 21, "Nữ", "NA");
        quanLy.them(canBo1);
        quanLy.them(canBo2);
        quanLy.them(canBo3);
        quanLy.them(canBo4);
        quanLy.hienThiDanhSachCanBo();

        quanLy.timKiem("thien");
        canBo1.setHoTen("thien");
        canBo1.setTuoi(45);
        canBo1.setDiaChi("avc");
        canBo1.setGioiTinh("Nam");
        quanLy.hienThiDanhSachCanBo();

    }
}
