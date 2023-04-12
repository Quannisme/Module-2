package ss07_java.TH.animal;

public class chicken extends animal implements Edible{
    public String makesound()
    {
        return "Chicken: cluck-cluck!";
    }
    chicken(){}
    public String HowToEat()
    {
        return "could be fried";
    }
}
