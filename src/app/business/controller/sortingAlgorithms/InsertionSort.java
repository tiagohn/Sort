package app.business.controller.sortingAlgorithms;

import app.business.controller.SortCommand;

public class InsertionSort implements SortCommand
{
	public int[] exec(int[] list)
	{
		// Adapted from wikipedia (https://pt.wikipedia.org/wiki/Insertion_sort)
		int numTrocas = 0;
        
	    long startTime = System.currentTimeMillis(); 
		
		for (int i = 1; i < list.length; i++)
		{
			
			int current_value = list[i];
			int j = i;
			
			while ((j > 0) && (list[j-1] > current_value))
			{
				list[j] = list[j-1];
				j -= 1;
				numTrocas += 1;
			}
			list[j] = current_value;
                
		}
		
		//-------- Elapsed time (in seconds) -------------
	     
	    long Time = (System.currentTimeMillis() - startTime);
	      
	    double TimePerSec = (double)Time/1000;
	     
	    //--------------------------------------------------------------
	    
	    System.out.println("*** Insertion Sort ***\n"+
	    				   "Quantidade de elementos: " + list.length +
	    				   "\nTempo decorrido: " + TimePerSec +
	    				   "\nQuantidade de trocas: " + numTrocas + "\n");
		
		return list;
	}

}
