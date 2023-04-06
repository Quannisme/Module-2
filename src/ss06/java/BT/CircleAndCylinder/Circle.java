package ss06.java.BT.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    Circle() {
    }

    Circle(double Radius, String Color) {
        setRadius(Radius);
        setColor(Color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
