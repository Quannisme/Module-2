package ss06.java.TH;

//import jdk.nashorn.internal.ir.WithNode;

public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle()
    {
        this.width=1.0;
        this.length=1.0;
    }
    Rectangle(double Width , double Length , String Color , boolean Filled)
    {
        super(Color , Filled);
        setWidth(Width);
        setLength(Length);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea()
    {
        return getWidth()*getLength();
    }
    public double getPerimeter()
    {
        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString() {
        return "A Rectangle with "+
                "Width = "+getWidth()+
                "and length= "+getLength()+
                "which is a subclass of "+super.toString();
    }
}
