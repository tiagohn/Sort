package app.business.controller.sortingAlgorithms;

import app.business.controller.SortCommand;

public class SelectionSort implements SortCommand
{

	public int[] exec(int[] list)
	{
		// Adapted from wikipedia (https://pt.wikipedia.org/wiki/Selection_sort)
		int numTrocas = 0;
        
	    long startTime = System.currentTimeMillis(); 
		
		for (int i = 0; i < list.length; i++)
		{
			int posicaoMenor = i;
			for (int j = (i + 1); j < list.length; j++)
			{
				if (list[j] < list[posicaoMenor])
				{
					posicaoMenor = j;
					numTrocas += 1;
				}
			}
			if (list[i] != list[posicaoMenor])
			{
				int temp = list[i];
				list[i] = list[posicaoMenor];
				list[posicaoMenor] = temp;
			}
		}
		
		//-------- Elapsed time (in seconds) -------------
	     
	    long Time = (System.currentTimeMillis() - startTime);
	      
	    double TimePerSec = (double)Time/1000;
	     
	    //--------------------------------------------------------------
	    
	    System.out.println("*** Selection Sort ***\n"+
	    				   "Quantidade de elementos: " + list.length +
	    				   "\nTempo decorrido: " + TimePerSec +
	    				   "\nQuantidade de trocas: " + numTrocas + "\n");
		
		return list;
	}

}
