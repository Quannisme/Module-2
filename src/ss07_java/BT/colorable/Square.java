package ss07_java.BT.colorable;

public class Square extends Shape implements Colorable {
    double area;
    String color;
    Square(){}
    Square(double Area , String Color)
    {
        this.area=Area;
        this.color=Color;
    }
    public String HowToColor()
    {
        return "all four sides..";
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
