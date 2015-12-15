package com.java.examples.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.java.examples.base.OrderItem;

//search given element in the array list
public class SearchElementInList {

	public static void main(String[] args) {
		List<OrderItem> orderItemList =  new ArrayList<OrderItem>();;
       getOrderItems(orderItemList);
       
       orderItemList.sort(new OrderItemSoryByCount());
       for (OrderItem orderItem : orderItemList) {
		System.out.println(orderItem.getItemCount());
	}
	}

	private static void getOrderItems(List<OrderItem> orderItemList) {
		//orderItemList = new ArrayList<OrderItem>();
		OrderItem orderItem1 = new OrderItem();
		orderItem1.setItemCount(10);
		orderItemList.add(orderItem1);
		OrderItem orderItem10 = new OrderItem();
		orderItem10.setItemCount(190);
		orderItemList.add(orderItem10);
		OrderItem orderItem2 = new OrderItem();
		orderItem2.setItemCount(108);
		orderItemList.add(orderItem2);
		OrderItem orderItem3 = new OrderItem();
		orderItem3.setItemCount(1123);
		orderItemList.add(orderItem3);
		OrderItem orderItem4 = new OrderItem();
		orderItem4.setItemCount(910);
		orderItemList.add(orderItem4);
		OrderItem orderItem5 = new OrderItem();
		orderItem5.setItemCount(120);
		orderItemList.add(orderItem5);
		OrderItem orderItem6 = new OrderItem();
		orderItem6.setItemCount(4);
		orderItemList.add(orderItem6);
		OrderItem orderItem7 = new OrderItem();
		orderItem7.setItemCount(101);
		orderItemList.add(orderItem7);
		OrderItem orderItem8 = new OrderItem();
		orderItem8.setItemCount(110);
		orderItemList.add(orderItem8);
		OrderItem orderItem9 = new OrderItem();
		orderItem9.setItemCount(1);
		orderItemList.add(orderItem9);
		
	}
		

}

class OrderItemSoryByCount implements Comparator<OrderItem>{

	public int compare(OrderItem o1, OrderItem o2) {
		if(o1.getItemCount() > o2.getItemCount()) return -1;
		if(o1.getItemCount() < o2.getItemCount()) return 1;
		return 0;
	}
	
}