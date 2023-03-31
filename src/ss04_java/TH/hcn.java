package ss04_java.TH;

public class hcn {
    double width, weigth;

    public hcn() {
    }

    public hcn(double Width, double Weigth) {
        this.width = Width;
        this.weigth = Weigth;
    }

    public double getArea() {
        return weigth * width;
    }

    public double getPerimeter() {
        return (weigth + width) * 2;
    }

    public String Display() {
        return "HCN" + "Width" + width + "Weigth" + weigth;
    }

    public static void main(String[] args) {
        hcn h1=new hcn(3,4);
        System.out.println("Dien tich"+h1.getArea());
    }
}
