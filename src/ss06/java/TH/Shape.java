package ss06.java.TH;

public class Shape {
    private String color;
    private boolean filled;
    Shape()
    {
        this.color="Green";
        this.filled=true;
    }
    Shape(String Color , boolean Filled)
    {
        setColor(Color);
        setFilled(Filled);
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with " +
                "color of'" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
