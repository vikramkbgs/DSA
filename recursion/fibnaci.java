/**
 * fibnaci
 * in fibnaci indexing start from 0;
 * like 0 1 1 2 3 5 (0, 1, 2 ...)
 */
public class fibnaci {

    public static int fib(int n)
    {
        if(n == 1)
        return 1;
        if(n <= 0)
        return 0;
        return fib(n-1)+fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.print(fib(5));
    }
}