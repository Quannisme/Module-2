package ss07_java.TH.ComparableCircle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
//        if (getRadius() > o.getRadius()) return 1;
//        else if (getRadius() < o.getRadius()) return -1;
//        else return 1;
        return getColor().compareTo(o.getColor());
    }

//    @Override
//    public int compareTo(ComparableCircle o) {
//        return this.getRadius().compareTo(o.getRadius());
//    }
}
/* khong truy cập được phương thức compareTo */