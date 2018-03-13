package app.business.controller;

public interface SortCommand
{
	/**
     * Sorts an Integer array
     * @param list - array to be sorted
     * @return array sorted
     */
	
	public int[] exec(int[] list);

}
