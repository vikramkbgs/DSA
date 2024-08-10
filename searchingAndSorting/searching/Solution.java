public class Solution {
    public static int search(int []arr, int x) {
        // Write your code here.
        int left, right;
        left = 0;
        right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return -1;
    }


}
