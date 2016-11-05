package AutomationFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


// Store Array 
// Loop through the array to check Duplicate
// Add the same key to duplicate elements

public class DuplicateElementsUsingHashMap {
	public static void main(String[] args)
	{
		int[] toSort = {1,2,3,4,2,4,4};
		  Map<Integer, Integer> sortMap = new HashMap<Integer, Integer> () ;
	//	  int counter=1;
		  for (int i=0 ; i < toSort.length; i++)
		  { 
			   if (sortMap.containsKey(toSort[i]))
			   		{
				    sortMap.put( toSort[i],sortMap.get(toSort[i])+1);
			   		}
			   else
			   		{
				   sortMap.put(toSort[i],1);
			   		}
			}
		  for (Entry<Integer, Integer> e : sortMap.entrySet()) {
	            System.out.println(e.getKey() + "---" + e.getValue());
	        }
  }
		  
	}
  

