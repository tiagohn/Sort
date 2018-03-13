package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import app.business.controller.InsertionSort;
import app.business.controller.SelectionSort;
import app.business.controller.Sort;

/***************************************************
*   UFPB - Universidade Federal da Paraíba
*           Ciências da Computação
*
*      ANALISE E PROJETO DE ALGORITMOS
*
*  Profº.: 	GILBERTO FARIAS DE SOUSA FILHO  
*
*
*           Algoritmos de ordenação
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
            
         
        }
        catch (NumberFormatException | IOException e)
        {
            e.printStackTrace();
        }

	}

}
