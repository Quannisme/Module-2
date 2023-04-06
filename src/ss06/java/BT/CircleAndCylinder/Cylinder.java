package ss06.java.BT.CircleAndCylinder;

public class Cylinder extends Circle {
    private double heigth;

    Cylinder() {
    }

    Cylinder(double Heigth, double Radius, String Color) {
        super(Radius, Color);
        setHeigth(Heigth);
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * getHeigth();
    }

    @Override
    public String toString() {
        return "Cylinder :" +
                "Heigth :" + getHeigth() +
                "Volume :" + getVolume() +
                "Radius :" + super.getRadius() +
                "Color : " + super.getColor();
    }

    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(3,4,"vang");
        System.out.println(c1);
    }
}
