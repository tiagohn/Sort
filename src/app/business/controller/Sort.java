package app.business.controller;

public class Sort
{
	public void run(int[] list, SortCommand sortType)
	{
		sortType.exec(list);
	}
	
}
