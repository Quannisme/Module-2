package ss02_java.BT;

public class so_nto_nho_hon_100 {
    public static void main(String[] args) {
        int n=2;
        for (int i = 0; i < 99; i++) {
            if(is_prime(n)==true)
            {
                System.out.println(n);
            }
            n++;
        }
    }
    public static boolean is_prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
