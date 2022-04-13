package Oop.Moveable;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float v) {
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
        Point sc = new Point(3.4f, 3.5f);
        System.out.println(sc);
    }
}