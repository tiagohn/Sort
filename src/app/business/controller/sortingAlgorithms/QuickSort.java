package app.business.controller.sortingAlgorithms;

import app.business.controller.SortCommand;

public class QuickSort implements SortCommand
{
	int swapNum = 0;

	@Override
	public int[] exec(int[] list)
	{
		// Adapted from geeksforgeeks (https://www.geeksforgeeks.org/quick-sort/)
		int ini = 0;
		int end = list.length-1;
		
		int response[];
        
	    long startTime = System.currentTimeMillis();
	    
	    response = sort(list, ini, end);
	  
	    //-------- Elapsed time (in seconds) -------------
	     
	    long Time = (System.currentTimeMillis() - startTime);
	      
	    double TimePerSec = (double)Time/1000;
	     
	    //--------------------------------------------------
	    
	    System.out.println("*** Quick Sort ***\n"+
	    				   "Quantidade de elementos: " + list.length +
	    				   "\nTempo decorrido: " + TimePerSec +
	    				   "\nQuantidade de trocas: " + swapNum + "\n");
	    
		return response;
	}

	/* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low  --> Starting index,
    high  --> Ending index */
	private int[] sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        
        return arr;
    }
	
	/* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
	private int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swapNum++;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
	
}
