package ss04_java.BT;

public class QuadraticEquation {
    double a,b,c;
    QuadraticEquation()
    {
    }
    QuadraticEquation(double A , double B , double C)
    {
        this.a=A;
        this.b=B;
        this.c=C;
    }
    public double getA()
    {
        return this.a;
    }
    public double getB()
    {
        return this.b;
    }
    public double getC()
    {
        return this.c;
    }
    public double getDiscriminant()
    {
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1()
    {
        return (-this.b+Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
    }
    public double getRoot2()
    {
        return (-this.b-Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
    }
}
