package ss07.java.BT.Resizeable;

public class Square extends Shape implements Resizeable {
    private double edge = 1.0;

    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return this.edge * this.edge;
    }

    @Override
    public double resize(double percent) {
        return getArea() * percent;
    }

    @Override
    public String toString() {
        return " A Square With Edge :" +
                edge +
                '}';
    }
}

