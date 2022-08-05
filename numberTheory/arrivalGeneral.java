import java.util.Scanner;

public class arrivalGeneral {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int maxf = -1;
        int max = 0;
        int minl = -1;
        int min = 99999;
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                maxf = i;
                max = a[i];
            }
            if (min >= a[i]) {
                minl = i;
                min = a[i];
            }
        }

        int ret = maxf + (n - 1) - minl;
        if (minl < maxf) {
            ret--;
        }
        System.out.println(ret);
    }
}
