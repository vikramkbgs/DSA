package sortring;

import java.io.*;
import java.util.Scanner;

public class BubbleSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr, int n){

       for(int i = 0; i<n-1; i++){

           for(int j =0; j<(n-1)-i; j++){
               if(arr[j] > arr[j+1]){
                   swap(arr, j, j+1);
               }
           }
       }
    }
    public static void solve(Scanner sc, PrintWriter pw){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
//            System.out.print(arr[i]+" ");
        }
//        System.out.println();
        bubbleSort(arr, n);

        for(int num : arr){
            pw.print(num+" ");
//            System.out.print(num+" ");
        }
//        System.out.println();
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
