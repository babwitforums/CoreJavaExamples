package com.java.examples.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopyAndAddAll {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		List list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list1.addAll(list2);
		list2.add(1, "333");
		for (Object object : list2) {
			System.out.println(object);
		}
		System.out.println("---");
		for (Object object : list1) {
			System.out.println(object);
		}
	}

}
