package app.business.controller.sortingAlgorithms;

import app.business.controller.SortCommand;

public class HeapSort implements SortCommand{

	private int swapNum;
	
	@Override
	public int[] exec(int[] list)
	{
		// Adapted from geeksforgeeks (https://www.geeksforgeeks.org/heap-sort/)
		this.swapNum = 0;
        
	    long startTime = System.currentTimeMillis();
		
		int n = list.length;
		 
        // Build heap
        for (int i = (n / 2) - 1; i >= 0; i--)
            maxHeapify(list, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--)
        {
            // Move current root to end
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
 
            // Reorganizes elements
            maxHeapify(list, i, 0);
        }
        
        //-------- Elapsed time (in seconds) -------------
	     
	    long Time = (System.currentTimeMillis() - startTime);
	      
	    double TimePerSec = (double)Time/1000;
	     
	    //--------------------------------------------------------------
	    
	    System.out.println("*** Heap Sort ***\n"+
	    				   "Quantidade de elementos: " + list.length +
	    				   "\nTempo decorrido: " + TimePerSec +
	    				   "\nQuantidade de trocas: " + swapNum + "\n");
        
        return list;
	}
	
	// To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
	private void maxHeapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = leftChild(i);  // left = 2*i
        int r = rightChild(i);  // right = 2*i + 1
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than 'largest'
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If 'largest' is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            this.swapNum ++;
 
            // Recursively heapify the affected sub-tree
            maxHeapify(arr, n, largest);
        }
    }
	
	private int leftChild(int index)
	{
		int i = index + 1;
		
		return (2 * i) - 1;
	}
	
	private int rightChild(int index)
	{
		int i = index + 1;
		
		return (2 * i);
	}

}
