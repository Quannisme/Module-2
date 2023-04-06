package ss06.java.BT.HaiDBaD;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D() {
    }

    Point2D(float X, float Y) {
        setX(X);
        setY(Y);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float X, float Y) {
        this.x = X;
        this.y = Y;
    }

    public float[] getXY() {
        float[] t = {x, y};
        return t;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
