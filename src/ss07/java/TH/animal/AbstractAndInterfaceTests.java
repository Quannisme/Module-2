package ss07.java.TH.animal;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        animal [] a1=new animal[12];
        a1[0]=new tiger();
        a1[1]=new chicken();
        for(animal a2:a1)
        {
            System.out.println(a2.makesound());
        }
    }
}
