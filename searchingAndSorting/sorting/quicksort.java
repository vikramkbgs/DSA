public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int partition(int[] arr, int low , int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i <= j)
        {
            if(pivot >= arr[i])
                i++;
            else if(pivot < arr[j])
                j--;
            else 
            swap(arr, i, j);
        }
        swap(arr, low, j);
    return j;
    }
    
    public static void quickSort(int[] input, int startIndex, int endIndex) {
			// your code goes here
        	if(startIndex >= endIndex)
                return;
        	int pi = partition(input, startIndex, endIndex);
            quickSort(input, startIndex, pi - 1);
        	quickSort(input, pi+1, endIndex);
		}



public static int partition(int[] arr, int low , int high){

	int pivot = arr[low];

	int i = low;

	int j = high;

	while(i <= j){

		if(pivot >= arr[i])
			i++;
		else if( pivot < arr[j])
			j--;
		else 
			swap(arr, i, j);
	}
	swap(arr, low, j);
	return j;
}

public static void quickSort(int[], int startIndex, int endIndex){
	if(startIndex >= endIndex)
		return;

	int pi = partition(input, startIndex, endIndex);
	quickSort(input, startIndex, pi -1);
	quicksort(input, pi+1, endIndex);
}



