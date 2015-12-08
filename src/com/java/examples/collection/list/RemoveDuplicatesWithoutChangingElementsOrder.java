package com.java.examples.collection.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;

// remove duplicates with out changing the order of the array list elements
public class RemoveDuplicatesWithoutChangingElementsOrder {

		
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(13);
		
		LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer>();
		for (Integer integer : arrayList) {
			linkedHashSet.add(integer);
		}
		for (Integer integer : linkedHashSet) {
			System.out.println(integer);
		}

	}

}
