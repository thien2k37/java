package try_catch;

public class Check {
    public void CheckTriangle(double a, double b, double c) throws Triangle {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0  || c <= 0) {
            throw new Triangle();
        }else {
            System.out.println("Tam giác hợp lệ ");
        }
    }
}
