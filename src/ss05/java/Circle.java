package ss05.java;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        c1.getRadius();
        c1.getRadius();
    }
}
