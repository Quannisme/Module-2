package ss07.java.BT.Colorable;

import ss07.java.BT.Colorable.Circle;
import ss07.java.BT.Colorable.Rectangle;
import ss07.java.BT.Colorable.Shape;
import ss07.java.BT.Colorable.Square;

public class test {
    public static void main(String[] args) {
        Shape[] s1=new Shape[3];
        s1[0]=new Square(3,"vang");
        s1[1]=new Rectangle(3,2);
        s1[2]=new Circle(3);
        for (Shape shapee:s1)
        {
            if(shapee instanceof Square) // kiem tra coi square co trong mảng k
            {
                System.out.println(((Square) shapee).HowToColor());
            }
        }
    }
}
