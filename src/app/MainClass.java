package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import app.business.controller.Sort;
import app.business.controller.sortingAlgorithms.InsertionSort;
import app.business.controller.sortingAlgorithms.MergeSort;
import app.business.controller.sortingAlgorithms.QuickSort;
import app.business.controller.sortingAlgorithms.SelectionSort;

/***************************************************
*   UFPB - Universidade Federal da Paraíba
*           Ciências da Computação
*
*      ANALISE E PROJETO DE ALGORITMOS
*
*  Profº.: 	GILBERTO FARIAS DE SOUSA FILHO  
*
*
*    Analise em algoritmos de ordenação
* ------------------------------------------------
*
*
*   Aluno: Tiago Henrique Nascimento
*
****************************************************/

public class MainClass
{

	public static void main(String[] args)
	{
		String msgIn = null;
        List<String> list = new LinkedList<String>();
         
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         
        try
        {
            while((msgIn = reader.readLine()) != null)
            {
                list.add(msgIn);           
            }
            
            int cap[] = new int[list.size()];
            
            for(int index = 0; index < list.size(); index++)
            {
            	cap[index] = Integer.parseInt(list.get(index));
            }
            
            Sort sort = new Sort();
            
            sort.run(cap.clone(), new InsertionSort());
            sort.run(cap.clone(), new SelectionSort());
            sort.run(cap.clone(), new MergeSort());
            sort.run(cap.clone(), new QuickSort());
            
         
        }
        catch (NumberFormatException | IOException e)
        {
            e.printStackTrace();
        }

	}

}
