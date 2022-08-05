/**
 * taxi
 */
import java.util.*;

public class taxi {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i <= j) {
            if (pivot >= arr[i])
                i++;
            else if (pivot < arr[j])
                j--;
            else
                swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        // your code goes here
        if (startIndex >= endIndex)
            return;
        int pi = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pi - 1);
        quickSort(input, pi + 1, endIndex);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        s.close();
        quickSort(arr, 0, n-1);
        
        int i = 0, j = n - 1;
        int cntTaxi = 0;
        int sum = 0;
        while(i < j)
        {
            if(arr[i] + arr[j] > 4)
            {
                cntTaxi++;
                j--;
            }
            else if(arr[i] + arr[j] == 4)
            {
                cntTaxi++;
                i++; j--;
            }
            else if (arr[i] + arr[j] < 4)
            {
                
                sum = arr[i] + arr[j];
                i++;
                if(sum == 4)
                {
                    cntTaxi++;
                    sum = sum%4;
                }
            }
        }

        if(sum > 0)
        cntTaxi++;
        System.out.println(cntTaxi);
    }
    
}