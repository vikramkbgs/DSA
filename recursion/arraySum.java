/**
 * arraySum
 */
public class arraySum {

    public static int arraySumHelper(int arr[], int startIndex)
    {
        if(startIndex == arr.length)
        return 0;
        return arr[startIndex] + arraySumHelper(arr, startIndex+1);
    }
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(arraySumHelper(a, 0));
    }
}