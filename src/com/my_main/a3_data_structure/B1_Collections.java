package com.my_main.a3_data_structure;

import java.util.LinkedList;

public class B1_Collections {

	public static void main(String[] args) {

		/**

		iterable-> Collection-> [Set ->(HashSet), List ->(LinkedList), Queue -> (DeQue)] {TreeSet}
		
		
		
		Map ->  [ConcurrentMap -> (ConcurrentHashMap), SortedMap -> (TreeMap) , (ABSTRACT_MAP ->(hashmap))]
		
		
		 **/
		
		
		
		//--------------
		
		
		LinkedList<String> myList= new LinkedList<>();
		
		myList.add("first");
		myList.add("last");
		
		myList.getFirst();
		myList.getLast();
		
		//deleting from first.
		myList.remove(); 
		
		myList.removeFirst();
		myList.pop();// remove and if empty then trow error.
		
		myList.removeFirst();
		
		// deleting from last
		myList.poll(); // it will not throw error
		
		
		
		
		
	}

}
