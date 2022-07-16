public class numDigit {
    
    public static int numDigitHelper(int n)
    {
        if(n <= 0)
        return 0;

        return 1 + numDigitHelper(n/10);

    }
    public static void main(String[] args) {
        System.out.print(numDigitHelper(123456));
    }
}
