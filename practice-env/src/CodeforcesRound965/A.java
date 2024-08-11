package CodeforcesRound965;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {

    public  static  void solve(Scanner sc){

        int xc, yc, k;
        xc = sc.nextInt();
        yc = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i<k; i++){

            int dif = -(k - 1) + 2 * i;
            System.out.println((xc+dif)+" "+(yc+dif));
        }
    }

    public static void main(String[] args){

        try {

            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            int testCase = sc.nextInt();

            while(testCase>0){
                solve(sc);
                testCase--;
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException("File Not Found Exception: "+e.getMessage());
        }


    }
}
