/**
 * power
 */
public class power {

    public static int power_(int x, int n)
    {
        if(n == 0)
        return 1;

        return x*power_(x, n-1);
    }
    public static void main(String[] args) {
        System.out.print(power_(5, 2));
    }
    
}