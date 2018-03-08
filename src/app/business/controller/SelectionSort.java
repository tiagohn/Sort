package app.business.controller;

public class SelectionSort implements Sort
{

	@Override
	public int[] sort(int[] list)
	{
		// Adapted from wikipedia (https://pt.wikipedia.org/wiki/Selection_sort)
		
		for (int i = 0; i < list.length; i++)
		{
			int posicaoMenor = i;
			for (int j = (i + 1); j < list.length; j++)
			{
				if (list[j] < list[posicaoMenor])
				{
					posicaoMenor = j;
				}
			}
			if (list[i] != list[posicaoMenor])
			{
				int temp = list[i];
				list[i] = list[posicaoMenor];
				list[posicaoMenor] = temp;
			}
		}
		
		return list;
	}

}
