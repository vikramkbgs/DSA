import java.util.Scanner;

/**
 * luckyNumber
 */
import java.util.*;
public class luckyNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int checkArr[] = new int[14];
        checkArr[0] = 4;
        checkArr[1] = 7;
        checkArr[2] = 44;
        checkArr[3] = 47;
        checkArr[4] = 74;
        checkArr[5] = 444;
        checkArr[6] = 447;
        checkArr[7] = 474;
        checkArr[8] = 744;
        checkArr[9] = 477;
        checkArr[10] = 747;
        checkArr[11] = 77;
        checkArr[12] = 774;
        checkArr[13] = 777;
        s.close();
        for(int i =0; i<14; i++)
        {
            if(n >= checkArr[i] && n % checkArr[i] == 0)
            {
                System.out.println("Yes");;
                return;
            }
        }
        
        System.out.println("No");
    }
}