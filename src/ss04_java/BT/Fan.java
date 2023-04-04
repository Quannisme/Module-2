package ss04_java.BT;

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean check = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {
    }

    Fan(int Speed, boolean Check, double Radius, String Color) {
        this.speed = Speed;
        this.check = Check;
        this.radius = Radius;
        this.color = Color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean getCheck() {
        return this.check;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    public void setSpeed(int Speed) {
        this.speed = Speed;
    }

    public void setCheck(boolean Check) {
        this.check = Check;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String toString() {
        if (this.check == true) {
            return "Fan is on" +
                    "Speed:" + this.speed +
                    "Radius:" + this.radius +
                    "Color:" + this.color;
        } else
            return "Off is Fan";
    }

    public static void main(String[] args) {
        Fan f1 = new Fan(3, true, 10, "Yellow");
        Fan f2 = new Fan(1, false, 5, "blue");
    }

}
