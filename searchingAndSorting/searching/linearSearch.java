import java.util.*;
public class Solution {

    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int index = - 1;
        
        for (int  i = 0; i<arr.length; i++){
            if (arr[i] == x)
                return i;
        }
        return index;
    }
}