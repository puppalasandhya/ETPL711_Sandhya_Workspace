package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
			ArrayList list=new ArrayList();
			list.add(100);
			list.add("hello");
			list.add(45.5);
			list.add(100);
			System.out.println(list);
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
	}

}