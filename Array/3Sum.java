/* 
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/
class Solution {
    public static void swap(int arr[], int startIndex, int endIndex){
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
        return;
    }

    public static int partition(int arr[], int startIndex, int endIndex){
        int pivot = arr[startIndex];
        int i = startIndex, j = endIndex;

        while(i <= j){
            if(pivot >= arr[i])
                i++;
            else if(pivot < arr[j])
                j--;
            else
                swap(arr, i, j);
        }
        swap(arr, startIndex, j);
        return j;
    }

    public static void quickSort(int arr[], int startIndex, int endIndex){
        if(startIndex >= endIndex)
            return;

        int partitionPoint = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, partitionPoint - 1);
        quickSort(arr, partitionPoint+1, endIndex);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        quickSort(nums, 0 , nums.length - 1);

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> unique = new HashSet<>();

        for(int i = 0; i < nums.length-2; i++){
            int ab = -nums[i];

            int firstPointer = i+1;
            int secondPointer = nums.length-1;

            while(firstPointer < secondPointer){
                if(nums[firstPointer] + nums[secondPointer] > ab)
                    secondPointer--;
                else if(nums[firstPointer] + nums[secondPointer] < ab)
                    firstPointer++;
                else{
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[firstPointer]);
                    temp.add(nums[secondPointer]);

                    unique.add(temp);
                    firstPointer++;
                    secondPointer--;
                }
            }
        }
        for(List<Integer> temp : unique)
            result.add(temp);
        return result;
    }
}