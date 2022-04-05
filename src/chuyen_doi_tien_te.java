import java.util.Scanner;


public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap usd");
        usd = sc.nextDouble();
        double quy_doi = usd * vnd;
        System.out.println("gia tri vnd:" + quy_doi);
    }
}
