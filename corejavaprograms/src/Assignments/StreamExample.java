package Assignments;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
public static void main(String[] args)  {
	List<Integer>list = Arrays.asList(20,10,3,4);
	List <Integer> filteredList = list.stream().filter(i -> i%2==0).toList();
	 
	System.out.println(filteredList);
	
	List<Integer> transformedList	= list.stream().map(i -> i * 2).toList();
 
	
	System.out.println("Transformed List:" + transformedList);
	List<Integer> marks= Arrays.asList(45,56,70,30,20,10);
	long NumberOfFailedStudent = marks.stream().filter (i -> i >35 ).count();
	 
	
	System.out.println(NumberOfFailedStudent);
	List<Integer> sortedMarks= marks.stream().sorted().toList();
	System.out.println(sortedMarks);
}

}
