import java.util.Scanner;

/**
 * taxi
 */
import java.util.*;
public class taxi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt[] = new int[4];
        for (int i = 0; i < n; i++) {
            cnt[s.nextInt() - 1]++;
        }
        int ans = cnt[3];
        int add = Math.min(cnt[0], cnt[2]);
        ans += add;
        cnt[0] -= add;
        cnt[2] -= add;
        ans += cnt[2];
        add = cnt[1] / 2;
        ans += add;
        cnt[1] -= 2 * add;
        ans += (cnt[0] + 2 * cnt[1] + 3) / 4;
        System.out.print(ans);
    }
}