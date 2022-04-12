package Oop.Point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(float x, float y, float z) {
        return new float[] {x,y,z};
    }

    @Override
    public String toString() {
        String abc = super.toString();
        return abc + " z =" + this.z;
    }
    public static void main(String[] args) {
        Point3D sc = new Point3D(3.4f, 4.5f, 2.0f);
        System.out.println(sc);
    }
}

