package Oop.Moveable;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr = new float[]{xSpeed, ySpeed};
        return arr;
    }
    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
    @Override
    public String toString() {
        String b = super.toString();
        return b + " Speed= " + "( " + xSpeed + ", " + ySpeed + " " + this.move() + ")";
    }

    public static void main(String[] args) {
        MoveablePoint sc = new MoveablePoint(3.4f, 4.6f, 4.5f, 2f);
        Point s = new Point(3.4f, 5.4f);
        System.out.println(sc + "+  " + s);
    }
}

