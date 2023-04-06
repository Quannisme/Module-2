package ss06.java.BT.HaiDBaD;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D() {
    }

    Point3D(float Z, float X, float Y) {
        super(X, Y);
        setZ(Z);
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float Z, float X, float Y) {
        super.setXY(X, Y);
        this.z = Z;
    }

    public float[] getXYZ() {
        float[] t = {z,super.getX(),super.getY()};
        return t;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D p1=new Point3D(2,3,4);
        System.out.println(p1);
    }
}
