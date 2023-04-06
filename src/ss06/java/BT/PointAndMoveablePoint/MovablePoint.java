package ss06.java.BT.PointAndMoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    MovablePoint(){}
    MovablePoint(float xSpeed ,float ySpeed ,float X, float Y)
    {
        super(X, Y);
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    MovablePoint(float xSpeed ,float ySpeed)
    {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setSpeed(float xSpeed ,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed()
    {
        float[] t={xSpeed,ySpeed};
        return t;
    }

    @Override
    public String toString() {
        return "MovablePoint" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed+
                "Point2D" +
                "x=" + super.getX() +
                ", y=" + super.getY() ;
    }
    public float move()
    {
        super.setX(getX()+xSpeed);
        super.setY(getY()+ySpeed);
        return super.getX()+super.getY();
    }

    public static void main(String[] args) {
        MovablePoint m1=new MovablePoint(3,4,5,6);
        System.out.println(m1);
    }
}