package Oop.Point;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = new float[]{x,y};
        return arr;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y;
    }
    public static void main(String[] args) {
        Point2D sc = new Point2D(3.4f, 3.5f);
        System.out.println(sc);
    }
}
