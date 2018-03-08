package app.business.controller;

public class InsertionSort implements Sort
{

	@Override
	public int[] sort(int[] list)
	{
		// Adapted from wikipedia (https://pt.wikipedia.org/wiki/Insertion_sort)
		
		for (int i = 1; i < list.length; i++)
		{
			
			int current_value = list[i];
			int j = i;
			
			while ((j > 0) && (list[j-1] > current_value))
			{
				list[j] = list[j-1];
				j -= 1;
			}
			list[j] = current_value;
                
		}
		
		return list;
	}

}
