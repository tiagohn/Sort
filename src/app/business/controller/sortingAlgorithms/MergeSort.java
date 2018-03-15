package app.business.controller.sortingAlgorithms;

import app.business.controller.SortCommand;

public class MergeSort implements SortCommand
{
	int swapNum = 0;

	@Override
	public int[] exec(int[] list)
	{
		// Adapted from geeksforgeeks (https://www.geeksforgeeks.org/merge-sort/)
		int ini = 0;
		int end = list.length-1;
		
		int response[];
        
	    long startTime = System.currentTimeMillis();
	    
	    response = sort(list, ini, end);
	  
	    //-------- Elapsed time (in seconds) -------------
	     
	    long Time = (System.currentTimeMillis() - startTime);
	      
	    double TimePerSec = (double)Time/1000;
	     
	  //--------------------------------------------------
	    
	    System.out.println("*** Merge Sort ***\n"+
	    				   "Quantidade de elementos: " + list.length +
	    				   "\nTempo decorrido: " + TimePerSec +
	    				   "\nQuantidade de trocas: " + swapNum + "\n");
	    
		return response;
		
	}
	
	// Main function that sorts arr[l..r] using
    // merge()
    private int[] sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        
        return arr;
    }
	
	void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                swapNum ++;
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
