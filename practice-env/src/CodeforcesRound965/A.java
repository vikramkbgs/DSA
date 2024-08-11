package CodeforcesRound965;

import java.io.*;
import java.util.Scanner;

public class A {

    public  static  void solve(Scanner sc, PrintWriter pw){

        int xc, yc, k;
        xc = sc.nextInt();
        yc = sc.nextInt();
        k = sc.nextInt();

        for(int i = 0; i<k; i++){

            int dif = -(k - 1) + 2 * i;
            pw.println((xc+dif)+" "+(yc+dif));
        }
    }

    public static void main(String[] args){

        try {

            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

            int testCase = sc.nextInt();

            while(testCase>0){
                solve(sc, pw);
                testCase--;
            }
        sc.close();
        pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File Not Found Exception: "+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("File Writer Found Exception: "+e.getMessage());
        }


    }
}
