package ss07_java.BT.resizeable;

public class test {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Rectangle(3.0,5.0);
        shape[1] = new Circle(4.0);
        shape[2] = new Square(7.0);
        System.out.println("The Old Area: ");
        for (Shape element : shape) {
            System.out.println(element.getArea());
        }



        Resizeable resizeable[] = new Resizeable[3];
        resizeable[0] = new Rectangle(3.0,5.0);
        resizeable[1] = new Circle(4.0);
        resizeable[2] = new Square(7.0);
        double random = Math.random() * 100;
        System.out.println("The New Area: ");
        for (Resizeable resize : resizeable) {
            resize.resize(random);
        }

    }
}
