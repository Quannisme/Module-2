package ss06.java.TH;

public class Circle extends Shape {
    private double radius;
    Circle()
    {
        this.radius=1.0;
    }
    Circle(double Radius , String Color , boolean Filled)
    {
        super(Color , Filled);
        setRadius(Radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea()
    {
        return Math.pow(radius,2)*Math.PI;
    }
    public double getPerimeter()
    {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with "+
                "Radius"+getRadius()+
                "which is a a subclass of "+
                super.toString();
    }
}
