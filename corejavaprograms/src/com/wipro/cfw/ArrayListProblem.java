package com.wipro.cfw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
public class ArrayListProblem {
public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(23);
	al.add(92);
	al.add(82);
	al.add(12);
	al.add(2);
	al.add(2);
	Collections.sort(al);
	System.out.println("the min value is:"+ al.get(0));
	System.out.println("the max value is:"+ al.get(al.size()-1));
	System.out.println("sorted in ascednding order" + al);
	Collections.reverse(al);
	System.out.println("sorted in reverse order" + al);
  LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(al);
al.clear();
for (Integer o: s);
al.addAll(s);
Collections.sort(al);
System.out.println("after deleting duplicates" + al);


}
}