package CodeforcesRound965;

import java.io.*;
import java.util.Scanner;

public class B {

    public  static  void solve(Scanner sc, PrintWriter pw){

    }

    public static  void  main(String[] args){

        try{
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);
            PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

            int testCase = sc.nextInt();
            while(testCase-- > 0){
                solve(sc, pw);
            }

        }catch(FileNotFoundException e){
            throw  new RuntimeException(e.getMessage());
        }catch (IOException e){
            throw  new RuntimeException("Exception found at writing: "+e.getMessage());
        }
    }
}
