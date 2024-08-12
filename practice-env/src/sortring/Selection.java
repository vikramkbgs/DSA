package sortring;

import java.io.*;
import java.util.Scanner;

public class Selection {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void  selectionSort(int[] arr, int n){

        for(int i=0; i<n-1; i++){
            int min_idx = i;

            for(int j=i+1; j <n; j++ )
                if(arr[min_idx] > arr[j])
                    min_idx = j;

            swap(arr, min_idx, i);
        }
    }

    public static void solve(Scanner sc, PrintWriter pw){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr, n);
        for(int num : arr){
            pw.print(num+" ");
        }
        pw.println();
    }

    public static void main(String [] args){

        File file = new File("input.txt");

        try {
            Scanner sc = new Scanner(file);
            int testCase = sc.nextInt();
//            System.out.println("testCase: "+testCase);

            PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

            while(testCase>0){
                solve(sc, pw);
                testCase--;
            }

            sc.close();
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
