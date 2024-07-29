package com.wipro.cfw;

	import java.util.ArrayList;
	import java.util.ListIterator;

	public class ListIteratorExample {

	    public static void main(String[] args) {
	        
	        ArrayList<String> stringList = new ArrayList<String>();
	        
	        stringList.add("Apple");
	        stringList.add("pear");
	        stringList.add("avacodo");
	        
	        
	        ListIterator<String> listIterator = stringList.listIterator();
	        
	        System.out.println("Retrieving elements in forward direction:");
	        while(listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }
	        
	        System.out.println("Retrieving elements in backward direction:");
	        while(listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	    }
	}


