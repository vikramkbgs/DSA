public class solution {

    public static void merge(int[] a, int[] b, int[] d){
        
        
        int i = 0;
        int j = 0; 
        int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] >= b[j])
            {
                d[k] = b[j];
            	j++;
            	k++;
            }
            else
            {
                d[k] = a[i];
                i++;
                k++;
            }
        }
        
        while(i < a.length)
        {
            d[k] = a[i];
            i++;
            k++;
        }
        
        while(j < b.length)
        {
            d[k] = b[j];
            j++;
            k++;
        }
    }
    
    
	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length <= 1)
            return;
        
        int[] p1 = new int[input.length/2];
        int[] p2 = new int[input.length - p1.length];
        
        for(int i = 0; i<p1.length; i++)
            p1[i] =  input[i];
        
         for(int i = p1.length; i<input.length; i++)
            p2[i - p1.length] =  input[i];
        
        mergeSort(p1);
        mergeSort(p2);
        merge(p1, p2, input);
		
	}
}
