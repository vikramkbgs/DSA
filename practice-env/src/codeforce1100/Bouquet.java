package codeforce1100;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    public static void solve(Scanner sc) {
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        HashMap<Integer, Integer> flower = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            flower.put(a, flower.getOrDefault(a, 0) + 1);
        }

        // Convert to a sorted list of pairs (x, cx)
        List<Map.Entry<Integer, Integer>> sortedFlower = new ArrayList<>(flower.entrySet());
        sortedFlower.sort(Map.Entry.comparingByKey());

//        System.out.println("Item counts: " + flower + " m: " + m);

        long maxSum = 0;

        // Iterate through each flower petal count
        for (int i = 0; i < sortedFlower.size(); i++) {
            int x = sortedFlower.get(i).getKey();
            int cx = sortedFlower.get(i).getValue();
            int maxFlowersWithX = m / x;

            // Iterate through all possible counts of flowers with x petals
            for (int k1 = 0; k1 <= Math.min(cx, maxFlowersWithX); k1++) {
                long totalCostForX = (long) k1 * x;
                long remainingBudget = m - totalCostForX;
                int k2 = 0;

                // Check if there is a flower with x+1 petals
                if (i + 1 < sortedFlower.size()) {
                    int nextX = sortedFlower.get(i + 1).getKey();
                    int nextCx = sortedFlower.get(i + 1).getValue();
                    k2 = (int) Math.min(nextCx, remainingBudget / nextX);
                }

                long currentSum = totalCostForX + (long) k2 * (x + 1);
                maxSum = Math.max(maxSum, currentSum);
            }
        }

//        System.out.println("Maximum sum under limit: " + maxSum);
        System.out.println(maxSum);
    }


    public static void main(String[] args) {
        try {
            // Create a Scanner object to read from the input.txt file
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            int testCase = sc.nextInt();

            while (testCase > 0) {
                solve(sc);
                testCase--;
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
