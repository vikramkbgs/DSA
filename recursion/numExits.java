import javax.print.attribute.standard.NumberUpSupported;

/**
 * numExits
 */
public class numExits {

    public static boolean numExitsHelper(int a[], int x, int startIndex)
    {
        if(startIndex == a.length)
        return false;
        return (a[startIndex] == x) || numExitsHelper(a, x, startIndex+1);
    }
    public static void main(String[] args) {
        int a[] = new int [3];
        a[0] = 5;
        a[1] = 8;
        a[2] = 18;

        System.out.print(numExitsHelper(a, 0, 0));
    }
}