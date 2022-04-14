package Oop.qlx;

public class Oto extends PhuongTien implements Comparable<Oto> {
    private int soCho;

    public Oto(String hang, String mau, String ten, int gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public Oto() {
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "Oto{"  + " Tên: " + getTen() +
                ", Giá: " + getGia() +
                ", NHà Sản Xuất: " + getHang() +
                '}';
    }

    @Override
    public int compareTo(Oto oto) {
        return getGia() - oto.getGia();
    }

}

